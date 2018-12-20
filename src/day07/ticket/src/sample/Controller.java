package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Controller {

    @FXML
    public TextArea output;
    public TextArea createDescription;

    public TextField createName;
    public TextField reserveID;
    public TextField deleteID;

    public Button btnReload;
    public Button btnCreate;
    public Button btnReserve;
    public Button btnDelete;
    
    public Label error;

    public Connection connection = null;


    public void actionReload(){
        //1 zmaze obsah output
        //2 connection do DB ... select * from table
        //3 v cykle vyskladat obsah pre output
        //4 zapisat obsah do outputu
        System.out.println("Reload");

        output.setText("");

        if (connection == null){
            createConnection();
        }


        // int c = 8;
        // c = c + 7;
        // ekvivalent
        // int c = 8;
        // c += 7;

        try {
            String outputContent = "";
            String query = "select * from tickets";
            Statement statement = connection.prepareStatement(query);
            ResultSet result = ((PreparedStatement) statement).executeQuery();
            while (result.next()){
                String id = result.getString("id");
                String name = result.getString("name");
                String description = result.getString("description");
                String reserved = result.getString("reserved");

                outputContent += "id: "+id + " name: " + name + " reserved n/y: " + reserved + "\n" + description + "\n\n";

                System.out.println(name);
            }
            output.setText(outputContent);
        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }


    }

    public void actionCreate(){
        // zobrat text z create name
        // zobrat text z create description
        // pripravit insert do DB
        // vykonat insert
        System.out.println("Create");

        String name = createName.getText().trim();
        String description = createDescription.getText().trim();

        if (description.equals("") || name.equals("")){
            return;
        }

        if (connection == null){
            createConnection();
        }

        try {
            String query = "insert into tickets(name, description, reserved) values(?,?,'n')";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setString(2,description);
            statement.executeUpdate();
            createDescription.setText("");
            createName.setText("");
        } catch (SQLException e){
            e.printStackTrace();
        }

        actionReload();
        // insert into tickets(name, description, reservation) values (name, description, 'n');
    }

    public void actionReserve(){
        // nacitat text z reserveID
        // pripravit update v DB
        // vykonat update
        System.out.println("Reserve");

        if (connection == null){
            createConnection();
        }

        try {
            String idToUpdate = reserveID.getText().trim();

            String regex = "^[0-9]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(idToUpdate);

            if (!matcher.matches()){
                return;
            }

            String query = "select * from tickets where id = ?";
            Statement statement = connection.prepareStatement(query);
            ((PreparedStatement) statement).setInt(1, Integer.valueOf(idToUpdate));
            ResultSet result = ((PreparedStatement) statement).executeQuery();

            if (result.next()){
                String state = result.getString("reserved");
                if (state.equals("y")){
                    // uz rezervovane
                    System.out.println("not available");
                    error.setText("not available");
                    return;
                }
            } else {
                error.setText("wrong ID");
                return;
            }
            error.setText("");

            query = "update tickets set reserved = 'y' where id = ?";
            statement = connection.prepareStatement(query);
            ((PreparedStatement) statement).setInt(1,Integer.valueOf(idToUpdate));
            ((PreparedStatement) statement).execute();

        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        actionReload();
    }

    public void actionDelete(){
        // zobrat text z deleteID
        // pripravit delete v DB
        // vykonat delete
        System.out.println("Delete");

        if (connection == null){
            createConnection();
        }

        try {
            String deleteIDvalue = deleteID.getText().trim();
            if (deleteIDvalue.equals("")){
                return;
            }
            String regex = "^[0-9]+$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(deleteIDvalue);

            if (!matcher.matches()){
                return;
            }

            String query = "delete from tickets where id = ?";
            Statement statement = connection.prepareStatement(query);
            ((PreparedStatement) statement).setInt(1,Integer.valueOf(deleteIDvalue));
            ((PreparedStatement) statement).execute();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        actionReload();
    }

    public void createConnection(){

        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/tickets?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        final String user = "root";
        final String password = "";

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to DB ...");
            connection = DriverManager.getConnection(DB_URL,user,password);
            System.out.println("Connection OK");

        } catch (SQLException e){
            System.out.println("Connection refused");
        } catch (Exception e){

        }
    }
}

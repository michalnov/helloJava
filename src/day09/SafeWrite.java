import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SafeWrite {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            File f = new File("cisla.txt");
            FileWriter fw = new FileWriter(f);
            if ( fw == null){
                return;
            }
            String t_hodnota = "";
            do {
                try {
                    t_hodnota = scanner.next();
                    fw.write(t_hodnota);
                } catch (NumberFormatException e){
                    e.printStackTrace();
                    fw.flush();
                    fw.close();
                }
            } while (!t_hodnota.equals("0"));

            fw.close();

        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

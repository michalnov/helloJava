import java.io.*;

public class ReadSimple {
    public static void main(String[] args) {
        try {
            File f = new File("source.txt");
            FileReader fr = new FileReader(f);
            BufferedReader buffer = new BufferedReader(fr);
            String riadok = "";
            while ((riadok = buffer.readLine()) != null){
                System.out.println(riadok);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

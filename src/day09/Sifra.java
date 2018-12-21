import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sifra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            File f = new File("sifra.txt");
            FileWriter fw = new FileWriter(f);

            char input = '0';
            do {
                input = scanner.next().charAt(0);
                input += 1;
                fw.write(input);
            } while (input != ('0'+1));
//            String swap = scanner.next();
//            for (char element: swap.toCharArray()) {
//                element+=1;
//                fw.write(element);
//            }
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

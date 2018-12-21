import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicWrite {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>();

        int pocetRiadkov = scanner.nextInt();

        for (int i = 0; i < pocetRiadkov; i++) {
            String t_vstup = scanner.next();
            input.add(t_vstup);
        }

        System.out.println();


        try {
            File f = new File("test.txt");
            FileWriter fw = new FileWriter(f);

            for (String t_element : input) {
                //System.out.println(t_element);
                fw.write(t_element+" ");
            }
            fw.flush();
            fw.close();
        } catch (IOException e){
            e.printStackTrace();
        }



    }
}

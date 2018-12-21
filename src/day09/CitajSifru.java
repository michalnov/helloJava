import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CitajSifru {

    public static void main(String[] args) {

        try {
            File f = new File("sifra.txt");
            FileReader fr = new FileReader(f);
            BufferedReader buffer = new BufferedReader(fr);
            String t_vstup = "";
            while ((t_vstup = buffer.readLine()) != null){
                System.out.println(t_vstup);
                for (char element: t_vstup.toCharArray()) {
                    element -=1; // element--; rovnake ako element = element - 1; alebo element-=1;
                    System.out.print(element);
                }
                System.out.println();
            }
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

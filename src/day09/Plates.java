import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plates {
    public static void main(String[] args) {
        List<String> znacky = new ArrayList<>();
        try {
            File f = new File("plates.txt");
            FileReader fr = new FileReader(f);
            BufferedReader buffer = new BufferedReader(fr);
            String t_vstup = "";
            while ((t_vstup = buffer.readLine()) != null){
                String[] swap = t_vstup.split(" ");
                for (String element: swap) {
                    //System.out.println(element);
                    String regex = "^[A-Z]{2}[0-9]{3}[A-Z]{2}$"; // hladam prave formu pismeno pismeno cislo cislo cislo pismeno pismeno
                    //String regex = "^(KE)[0-9]{3}[A-Z]{2}$"; //hladam prave KE cislo cislo cislo pismeno pismeno
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(element);
                    if (matcher.matches()){
                        //System.out.println(element);
                        znacky.add(element);
                    }

                }
            }
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }

//        Example example = new Example();
//
//        ArrayList znacky = example.nacitajZnacky();
//
//        for (int i = 0; i < znacky.size(); i++) {
//            System.out.println(znacky.get(i));
//        }
//
//        znacky = example.triedenie(znacky);
//
//        System.out.println("Po triedeni");

        for (int i = 0; i < znacky.size(); i++) {
            System.out.println(znacky.get(i));
        }
    }
}

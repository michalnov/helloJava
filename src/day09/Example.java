import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {

    public void printInt(Integer a){
        System.out.println(a);
    }

    public ArrayList<String> nacitajZnacky(){
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
                    znacky.add(element);
                }
            }
            fr.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return (ArrayList<String>) znacky;
    }

    public ArrayList<String> triedenie(ArrayList<String> input){
        ArrayList<String> znacky = new ArrayList<>();
        for (String znacka: input) {
            String regex = "^[A-Z]{2}[0-9]{3}[A-Z]{2}$"; // hladam prave formu pismeno pismeno cislo cislo cislo pismeno pismeno
            //String regex = "^(KE)[0-9]{3}[A-Z]{2}$"; //hladam prave KE cislo cislo cislo pismeno pismeno
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(znacka);
            if (matcher.matches()){
                //System.out.println(element);
                znacky.add(znacka);
            }
        }
        return znacky;
    }
}

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeAndDateTime {

    public static void main(String[] args) {
	// write your code here

        LocalTime start = LocalTime.now();


        for (int i = 0; i < 1000000; i++) {
            System.out.println();            //iba na ukazku pre "zamestnanie" programu
        }

        LocalTime finish = LocalTime.now();

        System.out.println("start: " + start);
        System.out.println("finish: " + finish);

        System.out.println(finish.getSecond() - start.getSecond());


        LocalDateTime datumCas = LocalDateTime.now();
        System.out.println(datumCas);
        
    }
}

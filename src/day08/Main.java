import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int[] pole = new int[5];
//
//        for (int i = 0; i < 6; i++) {
//            pole[i] = 0;
//        }

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(7);
        list.add(6);
        list.add(5);

        Predicate<Integer> predicate = i -> (i % 2 == 0);  // podmienka "v premennej"


        list = list.stream()  //vytvorenie "prudu" dat
                .sorted()     // usporiadanie podla hodnoty prvkov
                .filter(predicate) //filtrovanie podla podmienky
                .map( i -> i*i)   //vykona funkciu na kazdom prvku ktory sa tam dostane 
                .collect(Collectors.toList()); // zozbiera a naplni do listu

        for (Integer swap : list) {  //for each ... prejde vsetky prvky listu
            System.out.println(swap);
        }


    }
}

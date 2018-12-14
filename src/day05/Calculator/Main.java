import calculator.Calc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Calc kalkulacka = new Calc();

        kalkulacka.scanInput();
        kalkulacka.vypocitaj();
        kalkulacka.printVysledok();

        double poVypocte = kalkulacka.getVysledok();



    }
}

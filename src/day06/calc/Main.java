import Calc;


public class Main {

    public static void main(String[] args) {
	// write your code here

        Calc kalkulacka = new Calc();

        kalkulacka.scanInput();
        kalkulacka.vypocitaj();
        kalkulacka.printVysledok();

        double poVypocte = kalkulacka.getVysledok();
        System.out.println(poVypocte);


    }
}

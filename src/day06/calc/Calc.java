package calc;

import java.util.Scanner;

public class Calc {

    private double vstup1;
    private double vstup2;
    private String operacia;  // + - * /
    private double vysledok;


    public void scanInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("zadaj prve cislo: ");
        this.vstup1 = scanner.nextDouble();

        System.out.println("zadaj operaciu: ");
        this.operacia = scanner.next();

        System.out.println("zadaj druhe cislo: ");
        this.vstup2 = scanner.nextDouble();
    }

    public void vypocitaj(){
        //this.vysledok = vstup1 operator vstup2; // neda sa
        switch (this.operacia){
            case "+":{
                this.vysledok = vstup1 + vstup2;
                break;
            }
            case "-":{
                this.vysledok = vstup1 - vstup2;
                break;
            }
            case "*":{
                this.vysledok = vstup1 * vstup2;
                break;
            }
            case "/":{
                this.vysledok = vstup1 / vstup2;
                break;
            }
            default:{
                System.out.println("Nespravny vstup");
            }
        }
    }

    public double getVysledok() {
        return vysledok;
    }

    public void printVysledok(){
        System.out.println("vysledok je: " + this.vysledok);
    }
}

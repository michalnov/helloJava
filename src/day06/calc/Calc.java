import java.util.Scanner;

public class Calc {

    private double vstup1;
    private double vstup2;
    private String operacia;  // + - * /
    private double vysledok;


    public void scanInput(){
        Scanner scanner = new Scanner(System.in);
        boolean invalidInput = false;

        do {
            invalidInput = false;
            try {
                System.out.println("zadaj prve cislo: ");
                String pom1 = scanner.next().trim();
                this.vstup1 = Double.valueOf(pom1);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                invalidInput = true;
            }

        } while (invalidInput);


        do {
            invalidInput = false;
            try {
                System.out.println("zadaj operaciu: ");
                this.operacia = scanner.next().trim();
                if (this.operacia.length() != 1){
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e){
                e.printStackTrace();
                invalidInput = true;
            }
        } while (invalidInput);


        do {
            invalidInput = false;
            try {
                System.out.println("zadaj druhe cislo: ");
                this.vstup2 = Double.valueOf(scanner.next());
            } catch (NumberFormatException e){
                e.printStackTrace();
                invalidInput = true;
            }
        } while (invalidInput);

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
                if (vstup2 == 0 || vstup2 == 0.0){
                    System.out.println("Nespravny vstup");
                    break;
                }
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

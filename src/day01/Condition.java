package day01;

public class Condition {
    public static void main(String[] args) {

        int a = 5;
        int b = 90;
        int c = b - a;

        if ( a > b) {
            System.out.println(" a > b ");
        } else if ( b < 0 ){
            System.out.println(" b < 0 ");
        } else if ( c == 85){
            System.out.println(" b - a == 85");
        } else {
            System.out.println("something else");
        }


        if ((a > 50) || (b > 50) || (c > 50)){
            System.out.println("one or more of numbers is larger than 50");
        }

        if (a > 0 && b > 0 && c > 0){
            System.out.println(" all of numbers are positive ");
        }

    }
}

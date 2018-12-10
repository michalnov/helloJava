import java.util.Scanner;

public class Triangle2 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zadaj stranu a: ");
        a = scanner.nextInt();

        System.out.print("Zadaj stranu b: ");
        b = scanner.nextInt();

        System.out.print("Zadaj stranu c: ");
        c = scanner.nextInt();

        if ((a + b) > c && (b + c) > a && (c + a) > b){
            System.out.println("triange perimeter is: "+(a+b+c));
        } else {
            System.out.println("wrong");

        }


    }
}

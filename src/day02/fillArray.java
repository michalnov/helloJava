import java.util.Scanner;

public class fillArray {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        System.out.print("zadaj velkost pola: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; ++i) {
            System.out.print("zadaj element "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+array[i]);
        }
    }
}

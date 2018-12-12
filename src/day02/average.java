import java.util.Scanner;

public class average {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int summ = 0;
        double average;

        for (int i = 0; i < n; i++) {
            summ = summ + i;
        }

        average = (double) summ / n;

        System.out.println(summ);
        System.out.println(average);
    }
}

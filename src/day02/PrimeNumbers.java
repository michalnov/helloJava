package day02;
public class PrimeNumbers {

    public static void main(String[] args) {
	// write your code here

        int num;
        int[] primeNumbers = new int[100];
        // int[] numbers = {1,5,4,6,78}
        int countOfPrimes = 0;

        for (num = 1; num < 100; num++) {
            boolean flag = true;
            for(int i = 2; i <= Math.sqrt(num); ++i)
            {
                if(num % i == 0)
                {
                    flag = false;
                    break;
                }
            }

            if (flag){
                //System.out.println(num + " is a prime number.");
                primeNumbers[countOfPrimes] = num;
                countOfPrimes++;
            }
            else{
                //System.out.println(num + " is not a prime number.");
            }
        }

        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.println(primeNumbers[i]);
        }
    }
}

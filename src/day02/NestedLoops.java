package day02;

public class NestedLoops {

    public static void main(String[] args) {
	// write your code here

        final int zaciatok = 0; //final zmeni premennu na konstantu
        final int koniec = 5;

        for (int i = zaciatok; i < koniec; i++) {

            for (int j = zaciatok; j < koniec; j++) {

                for (int k = zaciatok; k < koniec; k++) {
                    System.out.println("i " + i +  " j " + j + " k " + k);
                    //koniec++; URCITE NIE
                }
                System.out.println();
            }
            System.out.println("nova hodnota I");
        }

    }
}

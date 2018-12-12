package day03;

import java.util.Random;

public class FirstArrays_2D {

    public static void main(String[] args) {
        
        int[][] pole2D = new int[3][8];

        Random random = new Random();

        for (int i = 0; i < pole2D.length; i++) {

            for (int j = 0; j < pole2D[0].length; j++) {
                pole2D[i][j] = random.nextInt(50)+100;      // generuje od 100 do 100 + 50
                System.out.print(" "+pole2D[i][j]);               // a = 100 , b = 150  bound = b - a = 50 , posun = a
            }
            System.out.println();
        }

        System.out.println("\nnex\n");      // znak \n vo vypise urobi dalsi novy riadok

        for (int[] riadky : pole2D){

            for (int element : riadky){
                element = random.nextInt(50)+100;      // generuje od 100 do 100 + 50
                System.out.print(" "+element);
            }
            System.out.println();
        }
        
    }
}

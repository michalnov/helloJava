package day02;

public class FirstArrays {

    public static void main(String[] args) {

        int[] pole = {15,25,3,4,5,6,4,7,8};
        int sucet = 0;

        System.out.println("size of array is :" + pole.length);

        for (int i = 0; i < pole.length; i++) {
            //System.out.println(pole[i]);
            sucet = sucet + pole[i];
        }

        System.out.println("sucet 1 :"+sucet);
        System.out.println("priemer 1 :" + (double)sucet / pole.length);
        sucet = 0;

        for (int i = 0; i < pole.length; i++) {
            //System.out.println(pole[i]);
            sucet = sucet + pole[i];
        }
        System.out.println("sucet 2 :"+sucet);

        double priemer = (double) sucet / pole.length;

        System.out.println("priemer 2:" + priemer);
    }
}

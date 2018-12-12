package day03.TriangleObjects;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Triangle abc = new Triangle(2,3,4);
        Triangle bcd = new Triangle(3,5,9);

//        abc.a = 2;  //nastavovanie stran bez konstruktora
//        abc.b = 3;
//        abc.c = 4;

        System.out.println(abc.isPossibleToCreate());
        System.out.println(abc.perimeter());

        System.out.println(bcd.isPossibleToCreate());
        System.out.println(bcd.perimeter());


        Triangle[] arr = new Triangle[5];

        Random r = new Random();

        for (Triangle element : arr){
            element = new Triangle(r.nextInt(10), r.nextInt(10), r.nextInt(10));
            System.out.println(element.perimeter());
        }

    }
}

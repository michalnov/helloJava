package day03;
public class MethodSumm {

    public static void main(String[] args) {
	// write your code here

        sucet(3.0, 8); //pouzije druhu metodu aj ked jeden z scitancov je typu INT
        sucet(1, 8);
	printHello();

    }


    public static void sucet(int a, int b){
        System.out.println(a + b);
    }

    public static void sucet(double a, double b){
        System.out.println(a + b);
    }

//    public static void sucet(double a, int b){
//        System.out.println(a + b);
//    }
	
    public static void printHello(){
        System.out.println("Hello");
    }

}

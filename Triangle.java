public class Triangle {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        if ((a + b) > c && (b + c) > a && (c + a) > b){
            System.out.println("triangle perimeter is: "+(a+b+c);
        } else {
            System.out.println("wrong input");
        }


    }
}

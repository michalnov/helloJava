public class isTriangle {

    public static void main(String[] args) {
        // write your code here

        if (isTiangle(3,4,5)){
            System.out.println("It is a triangle");
        } else {
            System.out.println("NO it is not a triangle");
        }

        System.out.println("da sa zostrojit? : "+isTiangle(3,4,5));

    }


    public static void printTiangle(int a, int b, int c){
        if ( c < a + b  && b + c > a && c+a > b){
            System.out.println("It is a triangle");
        } else {
            System.out.println("NO it is not a triangle");
        }
    }

    public static boolean isTiangle(int a, int b, int c){
        return  ( c < a + b  && b + c > a && c+a > b);
    }


}

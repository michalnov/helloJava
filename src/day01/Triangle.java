package day01;

public class Triangle {

    public static void main(String[] args) {

        int a = 3;
        int b = 40;
        int c = 5;


        if (a < 0 || b < 0 || c < 0){                   //prve mozne riesenie
            System.out.println("wrong input");
            return;
        }

        if ((a+b)< c){
            System.out.println("wrong");
            return;
        }
        if ((c+b)< a){
            System.out.println("wrong");
            return;
        }
        if ((a+c)< b){
            System.out.println("wrong");
            return;
        }
        System.out.println("it is possible to create triange");




        if ((a+b)>c){                               //druhe mozne riesenie
            if ((b+c)>a){
               if ((c+a)>b){
                    System.out.println("it is possible to create triange");
                    return;
                }
            }
        }
        System.out.println("wrong");






        if ((a + b) > c && (b + c) > a && (c + a) > b){     //tretie mozne riesenie
            System.out.println("it is possible to create triange");
        } else {
            System.out.println("wrong");
        }
    }


}

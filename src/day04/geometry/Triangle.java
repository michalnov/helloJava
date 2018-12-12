package day04.geometry;

public class Triangle {
    private double a;
    private double b;
    private double c;

    private static int count;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double perimeter(){ //metoda
        if (isPossibleToCreate()){
            return this.a + this.b + this.c;
        } else {
            return 0;
        }
    }

    public boolean isPossibleToCreate(){ // metoda
        if (a+b > c && b+c > a && c+a > b){
            return true;
        } else {
            return false;
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public static int getCount() {
        return count;
    }
}

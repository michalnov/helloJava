package day04.geometry;

public class Rectangle {

    private double a;
    private double b;

    private double perimeter;
    private double area;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        calculatePerimeter();
        claculateArea();
    }

    private void calculatePerimeter(){
        if (this.isPossibleToCreate()){
            this.perimeter = 2 * this.a + 2 * this.b;
        } else {
            this.perimeter = 0;
        }
    }

    private void claculateArea(){
        if (isPossibleToCreate()){
            this.area = this.a * this.b;
        } else {
            this.perimeter = 0;
        }
    }

    public boolean isPossibleToCreate(){
        return (this.a > 0 && this.b > 0);
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
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
}

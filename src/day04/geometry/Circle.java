package day04.geometry;

public class Circle {

    private double radius;
    private double diameter;

    private double area;
    private double perimeter;

    private void update(){
        if (isPossibleToCreate()){
            this.area = Math.PI*(this.radius*this.radius);
            this.perimeter = (2 * Math.PI * this.radius);
        } else {
            this.perimeter = 0;
            this.area = 0;
        }
    }

    public boolean isPossibleToCreate(){
        return (this.radius > 0 && this.diameter > 0);
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.diameter = 2 * radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        this.radius = diameter / 2;
    }
}

package day04.points;

public class Point1d {
    protected int positionX;

    public Point1d() {
    }

    public double DistanceFromZero(){
        return (double) positionX;
    }

    public Point1d(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
}

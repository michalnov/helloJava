package day04.points;

public class Point2d extends Point1d {
    protected int positionY;

    @Override
    public double DistanceFromZero() {
        return Math.sqrt((double) (this.positionX*this.positionX)+(this.positionY*this.positionY));
    }

    public Point2d() {
    }

    public Point2d(int positionX, int positionY) {
        super(positionX);
        this.positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
}

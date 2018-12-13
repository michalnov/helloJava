package points_lecture;

public class Point2D extends Point1D {
    protected int positionY;

    public Point2D() {

    }

    public Point2D(int positionX, int positionY) {
        super(positionX);   // podobne ako new Point1D(positionX);
        this.positionY = positionY;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    @Override
    public double distanceFromZero() {
        return Math.sqrt((this.positionX*this.positionX)+(this.positionY*this.positionY));
    }
}

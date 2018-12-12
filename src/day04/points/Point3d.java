package day04.points;

public class Point3d extends Point2d {
    private int positionZ;

    @Override
    public double DistanceFromZero() {
        return Math.sqrt((double) (this.positionX*this.positionX)+(this.positionY*this.positionY)+(this.positionZ*this.positionZ));
    }

    public Point3d(int positionX, int positionY, int positionZ) {
        super(positionX, positionY);
        this.positionZ = positionZ;
    }

    public int getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(int positionZ) {
        this.positionZ = positionZ;
    }
}

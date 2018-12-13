package points_lecture;

public class Point3D extends Point2D {
    protected int positionZ;

    public Point3D() {
    }

    public Point3D(int positionX, int positionY, int positionZ){
        super(positionX, positionY); // treba dodrzat poradie X ... Y ... Z
        this.positionZ = positionZ;
    }

    public int getPositionZ() {
        return positionZ;
    }

    public void setPositionZ(int positionZ) {
        this.positionZ = positionZ;
    }
}

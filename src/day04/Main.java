package day04;

import day04.points.Point3d;

public class Main {
    public static void main(String[] args) {
        Point3d test = new Point3d();

        test.setPositionX(3);
        test.setPositionY(3);
        test.setPositionZ(3);

        System.out.println(test.DistanceFromZero());

    }
}

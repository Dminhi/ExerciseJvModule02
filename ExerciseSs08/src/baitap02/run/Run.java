package baitap02.run;

import baitap02.ra.Point2D;
import baitap02.ra.Point3D;

public class Run {
    public static  Point2D point2D = new Point2D(2,3);
    public static  Point3D point3D = new Point3D(3,4,5);

    public static void main(String[] args) {

        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}

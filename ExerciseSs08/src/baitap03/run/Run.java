package baitap03.run;

import baitap03.ra.MovablePoint;
import baitap03.ra.Point;

public class Run {
    public static Point point = new Point(3,4);
    public static MovablePoint movablePoint = new MovablePoint(6,8,3,4);

    public static void main(String[] args) {
        System.out.println(point.toString());
        System.out.println(movablePoint.move());
    }

}

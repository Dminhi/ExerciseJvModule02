package baitap03.run;

import baitap03.ra.MovablePoint;
import baitap03.ra.Point;

public class Run {
    // Khởi tạo đối tượng rồi truyền đối số
    public static Point point = new Point(3,4);
    // Khởi tạo đối tượng rồi truyền đối số
    public static MovablePoint movablePoint = new MovablePoint(6,8,3,4);

    public static void main(String[] args) {
        // Kiểm thử các phương thức của các lớp
        System.out.println(point.toString());
        System.out.println(movablePoint.move());
    }

}

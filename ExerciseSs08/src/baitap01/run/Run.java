package baitap01.run;

import baitap01.ra.Circler;
import baitap01.ra.Cylinder;

public class Run {
    // Truyền giá trị vào cho đối tượng mới lập
    public static Circler circler = new Circler(3,"red");
    public static Cylinder cylinder = new Cylinder(3,"red",2);
    public static void main(String[] args) {
        // Kiểm tra lớp supper và lớp sub
        System.out.println("Thể tích hình trụ là "+cylinder.cylinderArea());
        System.out.println("diện tích hình tròn là : "+circler.getCircleArea());
    }


}

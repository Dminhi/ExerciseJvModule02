package baitap04.run;

import baitap04.ra.Circle;
import baitap04.ra.Rectangle;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        System.out.println("Diện tích hình chữ nhật là : "+rectangle.getArea());
        System.out.println("Diện tích hình tròn là : "+circle.getArea());
        System.out.println("Màu của hình chữ nhật là : "+rectangle.display());
        System.out.println("Màu của hình tròn là : "+circle.display());
    }
}

package baitap02.run;

import baitap02.ra.Shape;
import baitap02.ra.*;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Shape[] shapes = new Shape[]{square,circle,rectangle};
        for (Shape s : shapes){
            if (s instanceof Square) {
                ((Square) s).howToColor();
            }else  {
                System.out.println("Area = "+s.getArea());
            }

        }
       }



}

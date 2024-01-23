package baitap01.run;

import baitap01.ra.*;

public class Test {
    public static void main(String[] args) {
//Kiểm thử Class Shape
        System.out.println("-------- - SHAPE----------");

        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

//kiểm thử Class Circle
        System.out.println("-------- - CIRCLE----------");

        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
        circle.resize(2);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
        rectangle.resize(2);
//Kiểm thử SQUARE
        System.out.println("---------SQUARE----------");

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);
        square.resize(2);

        // Tính diện tích và chu vi của từng hình
        System.out.println("Diện tích của hình chữ nhật là : " + Rectangle.getArea());
        System.out.println("Chu vi  của hình chữ nhật là : " + Rectangle.getPerimeter());
        System.out.println("Diện tích của hình tròn là : " + circle.getArea());
        System.out.println("Chu vi  của hình tròn là : " + circle.getPerimeter());
        System.out.println("Diện tích của hình vuông là : " + square.getArea());
        System.out.println("Chu vi của hình vuông là : " + square.getPerimeter());
        System.out.println("-----Diện tích và chu vi của hình sau khi tăng 2 là ------");
        rectangle.resize(2);
        circle.resize(2);
        System.out.println("Diện tích của hình chữ nhật là : " + Rectangle.getArea());
        System.out.println("Chu vi  của hình chữ nhật là : " + Rectangle.getPerimeter());
        System.out.println("Diện tích của hình tròn là : " + circle.getArea());
        System.out.println("Chu vi  của hình tròn là : " + circle.getPerimeter());
        System.out.println("Diện tích của hình vuông là : " + square.getArea());
        System.out.println("Chu vi của hình vuông là : " + square.getPerimeter());
    }
}

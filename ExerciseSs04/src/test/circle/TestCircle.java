package test.circle;

import build.circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle cc1 = new Circle();
        Circle cc2 = new Circle();
        cc1.displayData();
        cc2.displayData();
        Circle cc3 = new Circle(3.2,"red" );
        cc3.displayData();
        cc3.chuVi();
        cc3.dienTich();
        cc1.setColor("yellow");
        cc1.displayData();
        cc1.setRadius(4.3);
        cc1.chuVi();
        Circle cc4 = new Circle();
        cc4.inputData();
    }
}

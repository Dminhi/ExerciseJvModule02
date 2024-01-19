package baitap04.ra;

public class Triangel extends Shape {
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangel(double a, double b, double c) {
    }

    public Triangel(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangel() {
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea(){double p = (this.side1+this.side2+this.side3)/2;
        return (Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3)));}

    public double getPerimeter(){return (this.side1+this.side2+this.side3);}

    @Override
    public String toString() {
        return "Triangel{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color='" + color + '\'' +
                '}';
    }
}

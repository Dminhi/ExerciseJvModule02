package baitap01.ra;

public class Cylinder extends Circler {
private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public double cylinderArea(){
    return super.getCircleArea() * this.height;
}
}

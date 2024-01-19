package baitap01.ra;

public class Circler {
    final double PI = 3.14;
    private double radius;
    private String color;

    public double  getCircleArea(){
         return radius*radius*PI;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circler() {
    }

    public Circler(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}

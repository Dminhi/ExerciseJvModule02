package baitap04.ra;

public class Rectangle extends Shap{
    double width = 1;
    double height = 1;
    public Rectangle() {
    }
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {

        return width*height;
    }
    @Override
    public String display() {
        return  color + '\'' ;
    }
}

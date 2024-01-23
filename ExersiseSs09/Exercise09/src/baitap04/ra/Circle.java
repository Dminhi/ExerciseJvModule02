package baitap04.ra;

public class Circle extends Shap{
    double radius = 1;

    public Circle() {
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public String display() {
        return  color + '\'';
    }
}

package baitap04.ra;

public abstract class Shap {
    public String color="red";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shap() {
    }

    public Shap(String color) {
        this.color = color;
    }
    public abstract double getArea();
    public abstract String display();
}

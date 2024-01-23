package baitap01.ra;

public class Rectangle extends Shape implements Resizeable{
    @Override
    public void resize(double percent) {
        this.width = width*percent;
        this.height=height*percent;
    }

    private static double width;

    {
        width = 1.0;
    }

    private static double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static double getArea() {
        return width * height;
    }

    public static double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}

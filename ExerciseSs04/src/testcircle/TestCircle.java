package testcircle;

public class TestCircle {
    private double radius = 1.0;
    private String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

   public double getArea(){
        return radius*radius*2;
   }
}

package baitap01.ra;

public class Circler {
    // Tạo các biến theo đề bài
    final double PI = 3.14;
    private double radius;
    private String color;
    // Tính diện tích của hình tròn
    public double  getCircleArea(){
         return radius*radius*PI;
    }

    // getter và setter các biến

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
    // Khởi tạo đối tượng không giá trị tham chiếu
    public Circler() {
    }
    // Khởi tạo đối tượng có giá trị tham chiếu

    public Circler(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
}

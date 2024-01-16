package build.circle;

import java.util.Scanner;

public class Circle {
    private  double radius = 0;
    private  String color = "";

public Circle(){
    radius = 0;
    color = "No color";
}

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void chuVi(){
    double perimeter = 2*radius*3.14;
        System.out.println("Chu vi hình tròn là : "+perimeter);

    }

    public void dienTich(){
    double area = radius*radius*3.14;
        System.out.println("Diện tích hình tròn là : "+area);
    }

    public void inputData (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điền bán kính hình tròn");
        radius = scanner.nextDouble();
        System.out.println("Điền màu hình tròn");
        color = scanner.nextLine();
    }

    public void displayData(){
        System.out.println("Hình tròn có bán kính là "+radius);
        System.out.println("Hình tròn có màu là "+color);

    }
}

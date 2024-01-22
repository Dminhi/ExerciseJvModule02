package baitap01.ra;
    // extend class con cho class cha
public class Cylinder extends Circler {
    // Đặt biến mới ở class con
private double height;
    // Khởi tạo đối tượng có tham số lấy biến từ class cha và biến mới ở class con
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    // Lấy giá trị và đặt giá trị

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    // Khởi tạo đối tượng không tham số
    public Cylinder() {
    }
    // Khởi tạo đối tượng có tham số

    public double cylinderArea(){
    return super.getCircleArea() * this.height;
}
}

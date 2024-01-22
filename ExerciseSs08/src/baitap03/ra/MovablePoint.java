package baitap03.ra;
    // extend Class MovablePoint từ class Point
public class MovablePoint extends Point {
    // tạo 2 biến mới
    float xSpeed = 0f;
    float ySpeed = 0f;
    // Hàm khởi tạo có tham số
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    // Hàm khởi tạo có tham số lấy từ class supper và biến mới

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    // get và set các giá trị
    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){}
    public float [] getSpeed(){return new float[]{xSpeed,ySpeed};}

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    // Tạo hàm move theo đề bài
    public MovablePoint move(){ x+=xSpeed ;y+=ySpeed;return this;}
}

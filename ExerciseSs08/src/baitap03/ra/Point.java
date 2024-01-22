package baitap03.ra;

public class Point {
    // Tạo biến mới
    float x=0.0f;
    float y=0.0f;
    // Tạo hàm khởi tạo không tham số
    public Point() {
    }
    // Tạo hàm khởi tạo có tham số

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // set và get các giá trị
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
    }
    // Hàm khởi tạo mảng có giá trị x,y
    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

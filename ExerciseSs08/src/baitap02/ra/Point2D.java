package baitap02.ra;

public class Point2D {
    // Khởi tạo biến x,y
    float x = 0f;
    float y = 0f;
    // Hàm khởi tạo đối tượng không đối số
    public Point2D() {
    }
    // Hàm khởi tạo đối tượng có đối số

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // get và set các giá trị x,y
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

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

package baitap02.ra;
    // extends class Point3D từ class Point2D
public class Point3D extends Point2D {
    // Khởi tạo biến Z
    float z;
    // Hàm khởi tạo đối tượng không đối số
    public Point3D() {
    }
    // Hàm khởi tạo đối tượng có đối số lấy từ class con và thêm đối số
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    // get và set các giá trị biến mới
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
    }

    public float[] getXYZ() {
        return new float[]{x, y, z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

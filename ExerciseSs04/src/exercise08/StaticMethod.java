package exercise08;

public class StaticMethod {
    static double PI = 3.14;
    public double calCircleArea(double R){
        return R*R*PI;
    }

    public double calRectangleArea( double width,double height){
        return width*height;
    }

    public double calTriangleArea(double a,double b, double c){
        double p = (a+b+c)/2;
        return  Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

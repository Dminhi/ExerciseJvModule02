package test.exercise08;

import exercise08.StaticMethod;

public class Method {
    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Diện tích hình tròn có bán kính " + 3.5 +" là " + staticMethod.calCircleArea(3.5) );
        System.out.println("Diện tích hình tròn có bán kính " + 6 +" là " + staticMethod.calCircleArea(6) );
        System.out.println("Diện tích hình chữ nhật có 2 cạnh " +2.5+" "+6+" là " + staticMethod.calRectangleArea(2.5,6) );
        System.out.println("Diện tích hình chữ nhật có 2 cạnh " +4+" "+7+" là " + staticMethod.calRectangleArea(4,7) );
        System.out.println("Diện tích hình tam giác có 3 cạnh "+3+" "+4+" "+5+" là "+ staticMethod.calTriangleArea(3,4,5));
        System.out.println("Diện tích hình tam giác có 3 cạnh "+4.5+" "+7+" "+6+" là "+ staticMethod.calTriangleArea(4.5,7,6));

    }
}

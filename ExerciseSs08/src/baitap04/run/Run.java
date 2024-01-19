package baitap04.run;

import baitap04.ra.Shape;
import baitap04.ra.Triangel;

import java.util.Scanner;

public class Run {


    public static void main(String[] args) {
        Triangel triangel = new Triangel();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập màu sắc của hình");
        triangel.setColor(scanner.nextLine());
        System.out.println("Hãy nhập giá trị cạnh a");
        triangel.setSide1(Double.parseDouble(scanner.nextLine()));
        System.out.println("Hãy nhập giá trị cạnh b");
        triangel.setSide2(Double.parseDouble(scanner.nextLine()));
        System.out.println("Hãy nhập giá trị cạnh c");
        triangel.setSide3(Double.parseDouble(scanner.nextLine()));
        Shape shape = new Shape();
        System.out.println("Màu của hình tam giác là : "+ triangel.getColor());
        System.out.println("Diện tích của hình tam giác là : "+triangel.getArea());
        System.out.println("Chu vi của hình tam giác là : "+triangel.getPerimeter());
        Shape shape1 = new Triangel();
    }
}

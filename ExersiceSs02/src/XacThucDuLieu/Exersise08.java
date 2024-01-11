package XacThucDuLieu;

import java.util.Scanner;

public class Exersise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Nhập 3 giá trị của 1 tam giác");
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();
            // Xét điều kiện của 3 cạnh nhập vào có phải là 1 tam giác hay không
            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Chu vi của hình tam giác là" + ((a + b + c)));
                System.out.println("Diện tích của hình tam giác là" + s);
            } else {
            // Nếu không đúng nhập lại giá trị 3 cạnh
                System.out.println("Mời nhập lại giá trị");

            }

        }
    }}
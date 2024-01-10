import java.util.Scanner;

public class Exersise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Nhập 3 giá trị của 1 tam giác");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
                int p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Chu vi của hình tam giác là" + ((a + b + c)));
                System.out.println("Diện tích của hình tam giác là" + s);
            } else {
                System.out.println("Mời nhập lại giá trị");

            }

        }
    }}
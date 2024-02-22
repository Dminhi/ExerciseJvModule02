package baitap06;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập số chia");
            int divide = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số bị chia");
            int divided = Integer.parseInt(scanner.nextLine());
            int n = divides(divided,divide);
            System.out.println("kết quả của phép chia : " + n);
        } catch (ArithmeticException e) {
            System.out.println("Số bị chia không thể là : 0");
        } catch (Exception e){
            System.out.println("Lỗi không thể xác định");
        } finally {
            scanner.close();
        }
    }
    private static int divides(int divided,int divide){
        if(divide == 0){
throw new ArithmeticException("Số chia không thể là 0");

        }
        return divide/divided;

    }
}

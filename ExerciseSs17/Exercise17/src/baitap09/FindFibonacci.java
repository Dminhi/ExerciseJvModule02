package baitap09;

import java.util.Scanner;

public class FindFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí của số Fibonacci");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Số Fibonacci thứ " + n + " là " + Fibonacci(n));
    }

    private static int Fibonacci(int n) {
        try {
            if (n < 0) {
                throw new IllegalArgumentException("Số phần tử không được âm");
            }
            if (n <= 1) {
                return n;
            } else {
                return Fibonacci(n - 1) + Fibonacci(n - 2);
            }
        } catch (Exception e) {
            throw new  RuntimeException("Lỗi khi tính toán " + e.getMessage());
        }

    }
}

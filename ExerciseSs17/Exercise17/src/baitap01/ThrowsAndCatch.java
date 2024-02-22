package baitap01;

import java.util.Scanner;

public class ThrowsAndCatch {
    public static void main(String[] args) {
        int n = 0;
        int m = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {System.out.println("Hãy nhập số n");
                n = Integer.parseInt(scanner.nextLine());
                System.out.println("Hãy nhập số m");
                m = Integer.parseInt(scanner.nextLine());
                int sum = m+n;
                System.out.println(sum);
                break;
            }catch (Exception e){
                System.out.println("Nhập dữ liệu không đúng");
            }
        }

    }
}


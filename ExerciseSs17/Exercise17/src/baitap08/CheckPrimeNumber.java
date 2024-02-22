package baitap08;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời nhập số nguyên");
            int m = Integer.parseInt(scanner.nextLine());
            if(CheckPrimeNumber(m)){
                System.out.println(m + " : là số nguyên tố");
            }
            if(!CheckPrimeNumber(m)){
                System.out.println(m + " : không là số nguyên tố");
            }
        } catch (Exception e){
            System.out.println("Lỗi " + e.getMessage());
        }

    }

    private static boolean CheckPrimeNumber(int m) {
        if (m < 2) {
            throw new RuntimeException("Số nguyên tố phải lớn hơn 1 ");
        } else {
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}

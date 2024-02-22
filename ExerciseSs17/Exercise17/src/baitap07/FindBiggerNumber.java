package baitap07;

import java.util.Scanner;

public class FindBiggerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;
        int n;
        try {
            System.out.println("Điền số nguyên thứ nhất");
            m = Integer.parseInt(scanner.nextLine());
            System.out.println("Điền số nguyên thứ 2");
            n = Integer.parseInt(scanner.nextLine());
            int i = biggerNumber(m, n);
            if(i==0){
                System.out.println("2 số có giá trị bằng nhau là : "+ m);
            }else {
            System.out.println("Giá trị lớn hơn là : "+i);}
        } catch (Exception e) {
            System.out.println("Giá trị người dùng chuyền vào không phải là số nguyên");
        }
    }

    private static int biggerNumber(int m, int n) {
        if (m > n) {
            return m;
        }
        if (n > m) {
            return n;
        } return 0;
    }
}

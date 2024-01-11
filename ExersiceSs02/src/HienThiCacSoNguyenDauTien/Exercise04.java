package HienThiCacSoNguyenDauTien;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời điền số số nguyên tố cần in");
        // Nhập số số nguyên tố cần in
        int number = sc.nextInt();
        int count = 0;
        int n = 1;
        // Mỗi 1 lần chạy vòng lặp nếu in ra số nguyên tố thì tăng Count lên 1 đơn vị
        // đến khi count = number thì thoát vòng lặp
        while (count < number) {
            n++;
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(n + ", ");
                count++;
            }
        }
    }
}


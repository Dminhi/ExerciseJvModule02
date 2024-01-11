package HienThiCacLoaiHinh;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        System.out.println("Mời nhập giá trị");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // In dấu sao hình chữ nhật gồm 3 hàng và 7 cột
                for (int i = 1; i < 4; i++) {
                    for (int j = 1; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 2:
                // In dấu sao hình tam giác vuông góc trên trái
                for (int a = 0; a < 6; a++) {
                    for (int b = 5 - a; b > 0; b--) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                // In dấu sao hình tam giác vuông góc dưới trái

                for (int x = 0; x < 7; x++) {
                    for (int y = 0; y < x; y++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                // In dấu sao hình tam giác vuông góc trên phải
                for (int c = 0; c < 6; c++) {
                    for (int d = 0; d < c; d++) {
                        System.out.print("   ");
                    }
                    for (int e = 5 - c; e > 0; e--) {
                        System.out.print("*");
                    }
                    System.out.println("*");

                }
                // In dấu sao hình tam giác vuông góc dưới phải
                for (int m = 0; m < 6; m++) {
                    for (int l = 6 - m; l > 0; l--) {
                        System.out.print("   ");
                    }
                    for (int n = 0; n < m; n++) {
                        System.out.print("*");
                    }
                    System.out.println("*");

                }
                break;
            case 3:
                // In hình tam giác cân
                for (int n = 0; n < 5; n++) {
                    for (int l = 4 - n; l > 0; l--) {
                        System.out.print("-");
                    }
                    for (int m = 1; m < (2 * n + 1); m++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
            case 4:
                System.out.println("Exit");
        }
    }
}





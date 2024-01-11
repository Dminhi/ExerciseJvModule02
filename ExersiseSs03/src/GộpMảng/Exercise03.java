package GộpMảng;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khởi tạo mảng có số phần tử là 6
        int[] value = new int[3];
        // Khởi tạo mảng có số phần tử là 7
        int[] value1 = new int[4];
        // Khởi tạo mảng có số phần tử là tổng số phần tử của 2 mảng trên
        int[] sum = new int[7];
        for (int i = 0; i < value.length; i++) {
            System.out.println("Mời nhập số ở vị trí thứ " + i + " trong mảng 1");
            value[i] = scanner.nextInt();
        }
        for (int j = 0; j < value1.length; j++) {
            System.out.println("Mời nhập số ở vị trí thứ " + j + " trong mảng 2");
            value[j] = scanner.nextInt();
        }
        for(int z = 0;z<value.length;z++){
            sum[z]=value[z];
            System.out.println(sum[z]);
        }

    }
}

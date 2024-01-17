package sum.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Khởi tạo mảng có số phần tử là 3
        int[] value = new int[3];
        // Khởi tạo mảng có số phần tử là 4
        int[] value1 = new int[4];
        // Khởi tạo mảng có số phần tử là tổng số phần tử của 2 mảng trên
        int[] sum = new int[7];
        //Dùng vòng lặp để nhập giá trị
        for (int i = 0; i < value.length; i++) {
            System.out.println("Mời nhập số ở vị trí thứ " + i + " trong mảng 1");
            int number = scanner.nextInt();
            value[i]=number;
        }
        //Dùng vòng lặp để nhập giá trị
        for (int j = 0; j < value1.length; j++) {
            System.out.println("Mời nhập số ở vị trí thứ " + j + " trong mảng 2");
            int number = scanner.nextInt();
            value1[j] = number;
        }
        // Gộp 2 mảng trên thành 1 mảng
        for (int i = 0; i<value.length;i++){
            sum[i]=value[i];
        }
        for(int i = 0; i<value1.length;i++){
            sum[i+3]=value1[i];
        }
        System.out.println(Arrays.toString(sum));

    }
}

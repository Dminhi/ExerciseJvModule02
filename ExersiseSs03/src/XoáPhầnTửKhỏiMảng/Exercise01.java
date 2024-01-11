package XoáPhầnTửKhỏiMảng;

import java.util.Random;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số phần tử trong mảng");
        // Nhập số phần tử trong mảng
        int n = scanner.nextInt();
        System.out.println("Mời nhập số cần xoá");
        // Nhập giá trị cần xoá
        int x = scanner.nextInt();
        int[] number = new int[n];
        // Tạo 1 số ngẫu nhiên
        Random rd = new Random();
        boolean check = true;
        // Lọc qua các phần tử trong mảng, tìm vị trí i của phần tử có giá trị là x
        // thì gán giá trị phần tử ở vị trí thứ i cho vị trí thứ i+1
        for (int i = 0; i < n; i++) {
            // Tạo 1 giá trị bất kỳ từ 0-9 rồi gán cho cho từng phần tử trong mảng
            int ramdom = rd.nextInt(10);
            number[i] = ramdom;
        }
        for (int j = 0; j < number.length; j++) {
            if (number[j] == x) {
                number[j] = number[j + 1];
                // dùng j ++ để bỏ qua giá trị cần đã được gán
                j++;
            }
            System.out.print(number[j]);
        }
    }
}


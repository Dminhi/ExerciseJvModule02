package ThêmPhầnTửVàoMảng;

import java.util.Random;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử trong mảng");
        int n = scanner.nextInt();
        System.out.println("Hãy nhập số x");
        int x = scanner.nextInt();
        System.out.println("Hãy Nhập vị trí cần thêm");
        int index = scanner.nextInt();
        Random rd = new Random();
        int value[] = new int[n];
        if (index <= -1 && index >= value.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        }
        for (int i = 0; i < n; i++) {
            // Dùng vào lặp để đưa số ramdom vào từng vị trí trong mảng
            int ramdom = rd.nextInt(10);
            value[i] = ramdom;
        }
        // Gán giá trị tại vị trí thứ i bằng x
        value[index] = x;
        for (int j = 0; j < value.length; j++) {
            System.out.print(value[j]);
        }


    }
}

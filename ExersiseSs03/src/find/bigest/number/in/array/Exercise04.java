package find.bigest.number.in.array;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng");
        int m = scanner.nextInt();
        System.out.println("Nhập số cột của mảng");
        int n = scanner.nextInt();
        int [][]matrix = new int[m][n];
        // Dùng vòng lặp lặp qua từng phần tử trong matrix
        // Rồi điền các giá trị vào trong matrix
        for(int i=0; i<m;i++){
            for (int j = 0; j <n; j++) {
                System.out.println("nhập giá trị tại dòng "+i+" cột "+j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        int [] number = new int[1];
        // Gán vị trị toạ độ 0 0
        number[0]=matrix[0][0];
        //Dùng vòng lặp để so sánh giá trị
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[0].length ; j++) {
                if(number[0]<matrix[i][j]){
                    number[0]=matrix[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng maxtrix là:  "+number[0]);
    }
}

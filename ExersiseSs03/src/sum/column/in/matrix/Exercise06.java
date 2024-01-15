package sum.column.in.matrix;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        // Gọi hàm
    sumColumn();
    }
    public static void sumColumn(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hãy điền số dòng của matrix");
        int row = sc.nextInt();
        System.out.println("Hãy điền số cột của matrix");
        int column = sc.nextInt();
        System.out.println("Hãy điền cột muốn tính tổng");
        int sumNumberColmn = sc.nextInt();
        // Tạo mảng 2 chiều
        double [][] number = new double[row][column];
        //Dùng 2 vòng lặp để lặp qua từng phần tử trong mảng 2 chiều
        // để lấy giá trị của ngươi dùng
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.println("Hãy nhập giá trị hàng "+i+" cột "+j);
                number[i][j]=sc.nextDouble();
            }
        }
        //Đặt biến xong rồi tính tổng các giá trị theo cột
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
                sum+=number[i][sumNumberColmn-1];
        }
        System.out.println("Tổng giá trị của cột " + sumNumberColmn + " là :"+ sum);
    }
}



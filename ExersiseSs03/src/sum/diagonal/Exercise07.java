package sum.diagonal;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        sumDiagonal();
    }
    public static void sumDiagonal (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy điền cạnh của một hình vuông");
        int column = scanner.nextInt();
        //Tạo mảng 2 chiều
        double [][] number = new double[column][column];
        //Dùng vòng lặp để điền giá của từng phần tử
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                System.out.print("Điền giá trị tại hàng "+(i+1)+" cột "+(j+1)+" là ");
                number[i][j]=scanner.nextDouble();
            }
            System.out.print("");
        }
        // Tạo biến sum = 0
        double sum = 0;
        // Dùng vòng lặp để tìm phần tử thoả mãn điều kiện rồi cộng lại
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[0].length; j++) {
                if(i==j){sum+=number[i][j];}
                if(i+j==(column-1)&& i!=j){sum+=number[i][j];}
            }
        }
        System.out.println("Tổng của 2 đường chéo chính trong number là :"+sum);
    }
}


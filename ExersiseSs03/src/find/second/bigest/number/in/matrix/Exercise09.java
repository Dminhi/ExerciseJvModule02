package find.second.bigest.number.in.matrix;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        findNumber();
    }
    public static void findNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số phần tử trong mảng");
    int n = scanner.nextInt();
    double [] number = new double [n];
    // Dùng vòng lặp để điền giá trị từng phần tử trong mảng
        for (int i = 0; i < number.length; i++) {
            System.out.println("Hãy điền vị trí thứ " + (i+1) + " trong mảng");
             number[i] = scanner.nextDouble();
        }
    // Dùng vòng lặp để tìm ra số lớn nhất rồi gán vào giá trị vị trí thứ 0
        double max = number[0];
        double max1= number[0];
        for (int i = 0; i < number.length; i++) {
            if (max<number[i]){
                max1=max;
                max=number[i];
            }

            if(number[i]>max1&&number[i]!=max){
                max1=number[i];
            }
        }
        System.out.println("Giá trị lớn thứ 2 trong mảng là " + max1);

    }
}

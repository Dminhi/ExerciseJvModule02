package find.smallest.number.in.array;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        findNumber();
    }
    public static void findNumber (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập kích thước của mảng");
        // Nhập kích thước của mảng
        int size = sc.nextInt();
        // Mảng có kích thước là size từ nguời dùng nhập ở trên
         int [] newNumber = new int[size];
        // Dùng vòng lặp để lấy giữ liệu từ người dùng
        for (int i = 0; i < newNumber.length; i++) {
            System.out.println("Hãy nhập phần tử thứ "+(i+1)+" Trong mảng newNumber");
            newNumber[i]= sc.nextInt();
        }
        //Dùng vòng lặp đê tìm phần tử nhỏ nhất
        for (int i = 1; i < newNumber.length; i++) {
            if(newNumber[0]>newNumber[i]){
                newNumber[0]=newNumber[i];
            }
        }
        System.out.println("Số nhỏ nhất trong mảng newNumber là "+ newNumber[0]);
    }
}

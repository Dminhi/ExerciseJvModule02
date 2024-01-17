package TinhTongSoChan;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        // Tính tổng các số chẵn trong khoảng nhập
        Scanner sc = new Scanner(System.in);
        // Nhập giá trị đầu
        System.out.println("Mời nhập số đầu");
        int beginNumber= sc.nextInt();
        // Nhập giá trị cuối
        System.out.println("Mời nhập số cuối");
        int endNumber = sc.nextInt();
        int sum = 0;
        for (int i=beginNumber;i<=endNumber;i++){
            if(i%2==0){sum+=i;}
        }
        System.out.println(sum);
    }


}

package baitap1;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số đầu");
        int beginNumber= sc.nextInt();
        System.out.println("Mời nhập số cuối");
        int endNumber = sc.nextInt();
        int sum = 0;
        for (int i=beginNumber;i<=endNumber;i++){
            if(i%2==0){sum+=i;}
        }
        System.out.println(sum);
    }


}

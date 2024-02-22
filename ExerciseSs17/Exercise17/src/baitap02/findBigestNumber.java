package baitap02;

import java.util.Objects;
import java.util.Scanner;

public class findBigestNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static int[] arr = new int[5];

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập số thứ : " + (i + 1));
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        try {
            for (int i : arr) {
                System.out.print(i+",");
            }
            System.out.println("Số lớn nhất trong mảng là : "+findNumber());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int findNumber() {
        if(arr.length==0){throw new RuntimeException("Mảng không được rỗng");
        }
        int max=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                max = arr[i+1];
            }
        }
        return max ;
    }
}

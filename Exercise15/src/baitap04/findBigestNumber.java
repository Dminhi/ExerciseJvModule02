package baitap04;
import java.util.Scanner;
public class findBigestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử trong mảng");
        int n = Integer.parseInt(scanner.nextLine());
        Integer [] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhập số thứ "+(i+1));
            arr[i]= Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Nhập số cần tìm");
        int findNumber = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==findNumber){
                System.out.println("Số cần tìm ở vị trí "+(i+1));
            }
            else { check = false;
            }
        } if(!check){
            System.out.println("Không tìm thấy số cần tìm");
        }
    }
}

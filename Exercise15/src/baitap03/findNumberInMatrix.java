package baitap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findNumberInMatrix {
    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần tìm");
        int findNumber = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < getArr().length; i++) {
            for (int j = 0; j < getArr()[i].length; j++) {
                System.out.print(getArr()[i][j]+",");
                if(getArr()[i][j]==findNumber){
                    System.out.println("\n"+"Vị trí của number trong matrix là ["+i+"] ["+j+"]");
                }
                else {
                    System.out.println("Không tìm thấy số trong matrix");
                }
            }
        }
    }

}

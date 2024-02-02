package baitap06;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int x, y;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            y = i;
            while (y>0&&x< arr[y-1]){
                arr[y]= arr[y-1];
                y--;
            }
            arr[y]=x;
            System.out.println("\n"+Arrays.toString(arr));

        }
    }
}

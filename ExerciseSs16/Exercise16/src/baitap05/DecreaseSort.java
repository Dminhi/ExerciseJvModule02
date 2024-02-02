package baitap05;

import java.util.Arrays;

public class DecreaseSort {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int[] array = arr;
        for (int i : array) {
            System.out.print(i + ", ");
        }
        // Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("\n" + Arrays.toString(array));
        // Selection Sort
        int[] array1 = arr;
        int min;
        for (int i = 0; i < array1.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[min] < array1[j]) {
                    min = j;
                }
                if (min != i) {
                    int temp = array1[min];
                    array1[min] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array1));
        // Insert Sort
        int[] array2 = arr;
        int x, y;
        for (int i = 1; i < array2.length; i++) {
            x = array2[i];
            y = i;
            while (y > 0 && x > array2[y - 1]) {
                array2[y] = array2[y - 1];
                y--;
            }
            array2[y] = x;
        }
        System.out.println(Arrays.toString(array2));
    }
}


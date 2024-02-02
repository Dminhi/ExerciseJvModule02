package baitap03;

import baitap02.model.Student;

public class StringSort {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        // Bubble Sort
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr.length - 1; j > i; j--) {
//                if (arr[j - 1].compareTo(arr[j])>0){
//                    String string = arr[j];
//                    arr[j]=arr[j-1];
//                    arr[j-1]=string;
//                }
//            }
//        }
//        for (String string : arr) {
//            System.out.println(string);
//        }
        // Selection Sort
//        int min;
//        for (int i = 0; i < arr.length-1; i++) {
//            min = i;
//            for (int j = +1; j < arr.length; j++) {
//                if(arr[min].compareTo(arr[j])<0){
//                    min = j;
//                }
//                if(min !=j){
//                    String string = arr[min];
//                    arr[min]=arr[j];
//                    arr[j]=string;
//                }
//            }
//        }
//        for (String string : arr) {
//            System.out.println(string);
//        }
        // Insert Sort
        int y;
        for (int i = 0; i < arr.length; i++) {
            String x = arr[i];
            y=i;
            while (y>0&&x.compareTo(arr[y-1])<0){
                arr[y]=arr[y-1];
                y--;
            }
            arr[y]=x;
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

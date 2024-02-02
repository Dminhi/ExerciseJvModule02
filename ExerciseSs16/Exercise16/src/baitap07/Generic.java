package baitap07;

import baitap02.model.Student;
import baitap04.FoolballTeam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(1, "minh", 9.3);
        students[1] = new Student(2, "thinh", 6.7);
        students[2] = new Student(3, "duc", 8.2);
        bubbleSort(students);
        System.out.println(Arrays.toString(students));
    }

    public static <T extends Comparable<T>>  void bubbleSort(T[] bubble){
        for (int i = 0; i < bubble.length; i++) {
            for (int j = bubble.length-1; j > i ; j--) {
                if(bubble[j-1].compareTo(bubble[j])>0){
                    T temp = bubble[j];
                    bubble[j]=bubble[j-1];
                    bubble[j-1]=temp;
                }
            }
        }
    }
    public static  <T> void bubbleSort(T[] bubble, Comparator<T> comparator){
        for (int i = 0; i < bubble.length; i++) {
            for (int j = bubble.length-1; j > i ; j--) {
                if(comparator.compare(bubble[j-1],bubble[j])>0){
                    T temp = bubble[j];
                    bubble[j]=bubble[j-1];
                    bubble[j-1]=temp;
                }
            }
        }
    }
}

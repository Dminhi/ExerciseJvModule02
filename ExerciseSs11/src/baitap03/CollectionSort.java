package baitap03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import static baitap07.DeleteEven.getIntegers;
import static java.util.Collections.sort;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}

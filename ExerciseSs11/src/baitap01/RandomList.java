package baitap01;

import java.util.*;

import static baitap07.DeleteEven.getIntegers;

public class RandomList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        System.out.println(Collections.max(arrayList));
    }
}

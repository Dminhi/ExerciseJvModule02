package baitap08;

import java.util.ArrayList;

import static baitap07.DeleteEven.getIntegers;

public class addAllList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.addAll(arrayList);
        System.out.println(newArrayList);
    }
}

package baitap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static baitap07.DeleteEven.getIntegers;

public class ReverceList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = arrayList.size(); i >0 ; i--) {
            newArrayList.add(arrayList.get(i-1));
        }
        System.out.println(newArrayList);
    }
}


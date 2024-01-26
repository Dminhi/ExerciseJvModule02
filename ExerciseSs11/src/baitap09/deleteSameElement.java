package baitap09;

import java.util.ArrayList;
import java.util.Random;

public class deleteSameElement {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(11));
        }
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (!newArrayList.contains(integer)) {
                newArrayList.add(integer);
            }
        }
        System.out.println(newArrayList);
    }
}

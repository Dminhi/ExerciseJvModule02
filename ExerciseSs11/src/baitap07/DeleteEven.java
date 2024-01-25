package baitap07;

import java.util.ArrayList;
import java.util.Random;

public class DeleteEven {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (Integer integer : arrayList) {
            if (integer % 2 != 0) {
                newArrayList.add(integer);
            }
        }
        System.out.println(newArrayList);
    }

    public static ArrayList<Integer> getIntegers() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }
}

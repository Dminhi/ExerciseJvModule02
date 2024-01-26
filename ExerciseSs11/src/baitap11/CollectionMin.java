package baitap11;

import java.util.ArrayList;

import static baitap07.DeleteEven.getIntegers;

public class CollectionMin {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        int minNumber = arrayList.get(0);
        for (Integer integer : arrayList) {
            if (minNumber > integer) {
                minNumber = integer;
            }
        }
        System.out.println(minNumber);
    }
}

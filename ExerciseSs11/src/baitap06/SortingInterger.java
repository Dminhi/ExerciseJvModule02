package baitap06;

import java.util.ArrayList;

import static baitap07.DeleteEven.getIntegers;

public class SortingInterger {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        int tepm;
        for (int i = 0; i < arrayList.size(); i++)
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i) < arrayList.get(j)) {
                    tepm = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, tepm);
                }
            }
        System.out.println(arrayList);
    }
}

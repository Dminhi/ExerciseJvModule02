package baitap10;

import java.util.ArrayList;

import static baitap07.DeleteEven.getIntegers;

public class SumList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getIntegers();
        System.out.println(arrayList);
        int sum=0;
        for (Integer i : arrayList) {
            sum+=i;
        }
        System.out.println(sum);
    }
}

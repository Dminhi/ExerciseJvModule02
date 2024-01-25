package baitap09;

import java.util.ArrayList;
import java.util.Random;

import static baitap07.DeleteEven.getIntegers;

public class deleteSameElement {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(11));
        }
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.contains(arrayList.get(i))){
                newArrayList.add(arrayList.get(i));
            }
        }
        System.out.println(newArrayList);
    }
}

package baitap05;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        Random random = new Random();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put(i, random.nextInt(100));
        }
        Collection<Integer> newList = hashMap.values();
        List<Integer> list = new ArrayList<>(newList);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

}


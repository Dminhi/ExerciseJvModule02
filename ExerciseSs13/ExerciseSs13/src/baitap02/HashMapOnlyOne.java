package baitap02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapOnlyOne {
    public static void main(String[] args) {
        String string = "igkemnfjfjjmk";
        String[] strings = string.split("");
        for (String s : strings) {
            System.out.print(s);
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            int n = 1;
            if (!hashMap.containsKey(strings[i])) {
                hashMap.put(strings[i], n);
            } else {
                n = hashMap.get(strings[i]) + 1;
                hashMap.put(strings[i], n);
            }
        }
        System.out.println(hashMap.entrySet());
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                System.out.println(key + " : " + hashMap.get(key));
            }
        }
    }
}

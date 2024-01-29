package baitap01;

import java.util.HashMap;

public class HashMapCount {
    public static void main(String[] args) {
        String string = "aabblkalkkk";
        String [] strings =  string.split("");
        for (String s : strings) {
            System.out.print(s);
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            int n = 1;
            if(!hashMap.containsKey(strings[i])){
                hashMap.put(strings[i],n);
            }else {
                n = hashMap.get(strings[i])+1;
                hashMap.put(strings[i],n);
            }
        }
        System.out.println(hashMap.entrySet());
    }
}

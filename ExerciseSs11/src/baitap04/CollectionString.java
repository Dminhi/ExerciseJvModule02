package baitap04;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionString {
    public static void main(String[] args) {
        String string = "Rekkei Academy để nông dân biết code";
        ArrayList <String> arrayList = new ArrayList<>();
        String [] strings = string.split("\s");
        arrayList.addAll(Arrays.asList(strings));
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length()>3){
                System.out.println(arrayList.get(i));
            }
        }
    }
}

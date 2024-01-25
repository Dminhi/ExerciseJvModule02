package baitap05;

import java.util.ArrayList;
import java.util.Collections;

public class ShortestWord {
    public static void main(String[] args) {
        String string = "My name is Hoang and I am 18 years old. " +
                "I was born in Thua Thien Hue province. " +
                "I have one younger brother. He is still in high school. " +
                "We fight all the time like Tom and Jerry. " +
                "My father is working in the social labour office. " +
                "He has worked there for 30 years. Before that, he was a war soldier. " +
                "My mother is working in the social insurance office. " +
                "My parents have been married for 25 years. " +
                "We moved to Dong Ha town and we have been living there since 1995. " +
                "In my early school years, I went to the kindergarten, Ham Nghi primary school, " +
                "Nguyen Hue secondary school, then Le Loi high school. " +
                "I like football and music. AC Milan is my favorite team. " +
                "My dream would become a good doctor to cure people.";
        ArrayList<String>arrayList = new ArrayList<>();
        String [] strings = string.split("\s") ;
        Collections.addAll(arrayList,strings);
        String stringMin = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if(stringMin.length()>arrayList.get(i).length()){
                stringMin = arrayList.get(i);
            }
        }
        System.out.println(stringMin);
    }
}

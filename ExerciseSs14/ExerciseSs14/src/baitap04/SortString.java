package baitap04;

import java.util.Arrays;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Để","Nông","Dân","Biết","Code");
        List<String> newList = strings.stream().sorted().toList();
        System.out.println(newList);
    }
}

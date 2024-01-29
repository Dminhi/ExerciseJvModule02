package baitap01;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class findMaxNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = ()-> random.nextInt(1000);
        List<Integer> integerList = Stream.generate(supplier).distinct().limit(100).toList();
        System.out.println(integerList);
        List<Optional<Integer>> newList = Collections.singletonList(integerList.stream().max((a, b) -> a - b));
        System.out.println(newList.get(0));
    }
}

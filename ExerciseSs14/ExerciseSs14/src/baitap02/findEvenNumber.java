package baitap02;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class findEvenNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = ()->random.nextInt(100);
        List<Integer> integerList = Stream.generate(supplier).distinct().limit(100).toList();
        System.out.println(integerList);
        Predicate<Integer> predicate = s->s%2==0;
        List<Integer> integerStream = integerList.stream().filter(predicate).toList();
        System.out.println(integerStream);

    }

}

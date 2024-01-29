package baitap03;

import javax.swing.*;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SumArrayNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = ()->random.nextInt(100);
        List <Integer> integerList = Stream.generate(supplier).distinct().limit(100).toList();
        System.out.println(integerList);
        Integer sum =  integerList.stream().reduce(0,Integer::sum);
        System.out.println(sum);

    }
}

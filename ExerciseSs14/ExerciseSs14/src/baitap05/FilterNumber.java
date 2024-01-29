package baitap05;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FilterNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier <Integer> supplier = ()-> random.nextInt(100);
        List<Integer> list = Stream.generate(supplier).distinct().limit(100).toList();
        System.out.println(list);
        System.out.println("Hãy nhập vào giá trị bất kỳ từ 1-100");
        Scanner scanner = new Scanner(System.in);
        int randomValue = Integer.parseInt(scanner.nextLine());
        Predicate <Integer> predicate = a -> a>randomValue;
        List<Integer> integerList = list.stream().filter(predicate).toList();
        Consumer<Integer> consumer = System.out::println;
        integerList.forEach(consumer);
    }
}

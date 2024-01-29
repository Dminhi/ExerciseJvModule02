package baitap06;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class isHasEven {
    public static void main(String[] args) {
        // Kiểm tra xem danh sách có chứa số chẵn hay không
        Random random = new Random();
        Supplier<Integer> supplier = ()->random.nextInt(100);
        List<Integer> integerList = Stream.generate(supplier).distinct().limit(100).toList();
        System.out.println(integerList);
        Predicate<Integer> predicate = a -> a % 2 == 0;
        boolean b = integerList.stream().anyMatch(predicate);
        System.out.println(b);
        // Chuyển đổi chuỗi thành chữ in hoa
        List<String> strings = Arrays.asList("Để","Nông","Dân","Biết","Code");
        Function<String,String> function = String ::toUpperCase;
        List<String> stringList = strings.stream().map(function).toList();
        System.out.println(stringList);
    }
}

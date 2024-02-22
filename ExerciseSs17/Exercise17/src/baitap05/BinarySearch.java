package baitap05;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class BinarySearch {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần tìm kiếm");
        int number = Integer.parseInt(scanner.nextLine());
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(100);
        Object[] integerList = Stream.generate(supplier).distinct().limit(10).toArray();
        for (Object o : integerList) {
            System.out.print(o + " ");
        }
        Arrays.sort(integerList);
        System.out.println("");
        for (Object o : integerList) {
            System.out.print(o + " ");
        }
        System.out.println(binarySearch(0, integerList.length - 1, integerList, number));
    }

    public static int binarySearch(int start, int end, Object arr[], int value) throws Exception {

        int midle = start + (end - start) / 2;
        if (value == (Integer) arr[midle]) {
            return midle;
        }
        if (midle == end || midle == start) {
            throw new Exception("Không tìm thấy");
        }
        if (value > (Integer) arr[midle]) {
            return binarySearch(midle + 1, end, arr, value);
        } else {
            return binarySearch(start, midle - 1, arr, value);
        }
    }
}

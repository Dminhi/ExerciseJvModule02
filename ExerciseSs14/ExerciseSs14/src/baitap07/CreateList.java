package baitap07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập số đầu");
        int beginNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập số cuối");
        int endNumber = Integer.parseInt(scanner.nextLine());
        IntStream integer = IntStream.range(beginNumber,endNumber);
        System.out.println(Arrays.toString(integer.toArray()));
    }
}

package baitap08;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        System.out.println("Hãy nhập ngày tháng năm đầu");
        Scanner scanner = new Scanner(System.in);
        LocalDate localDateFirst = LocalDate.parse(scanner.nextLine());
        System.out.println("Hãy nhập ngày tháng năm sau");
        LocalDate localDateEnd = LocalDate.parse(scanner.nextLine());
        int days = (int) ChronoUnit.DAYS.between(localDateFirst, localDateEnd);
        System.out.println(days);
    }}
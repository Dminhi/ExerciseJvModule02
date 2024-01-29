package baitap08;

import java.time.LocalDate;

public class Exercise12 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.minusDays(1));
        System.out.println(localDate.plusDays(1));
    }
}

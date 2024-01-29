package baitap08;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercise09 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2023,2,15);
        int days = (int) ChronoUnit.DAYS.between(localDate,localDate1);
        System.out.println(days);
    }
}

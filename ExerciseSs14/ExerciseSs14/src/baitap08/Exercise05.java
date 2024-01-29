package baitap08;

import java.time.LocalDate;
import java.time.YearMonth;

public class Exercise05 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2024,2);
        int days = yearMonth.lengthOfYear();
        System.out.println(days);


    }
}

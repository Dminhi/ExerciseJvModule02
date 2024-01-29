package baitap08;

import java.time.YearMonth;

public class Exercise04 {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2024,02);
        int days = yearMonth.lengthOfMonth();
        System.out.println(days);
    }
}

package baitap08;

import java.time.LocalDateTime;

public class Exercise11 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = localDateTime.minusDays(100);
        System.out.println(localDateTime2);
    }
}

package baitap08;

import java.time.LocalDateTime;

public class Exercise13 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.plusHours(10));
        System.out.println(localDateTime.minusHours(10));
    }
}

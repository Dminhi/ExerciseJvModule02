package baitap08;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Exercise10 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(1,1,1);
        double seconds = ChronoUnit.SECONDS.between(localTime,localTime1);
        System.out.println(seconds);
    }
}

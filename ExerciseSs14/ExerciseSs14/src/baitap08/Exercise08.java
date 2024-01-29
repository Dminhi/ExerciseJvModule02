package baitap08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise08 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}

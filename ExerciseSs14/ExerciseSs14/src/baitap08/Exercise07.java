package baitap08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise07 {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(dateTimeFormatter.format(localDate));
    }
}

package baitap08;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise01 {
    public static void main(String[] args) {
        ZonedDateTime dateTimeTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime dateTimeAustralia = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        ZonedDateTime dateTimeAmerica = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));

        System.out.println(dateTimeTokyo);
        System.out.println(dateTimeAustralia);
        System.out.println(dateTimeAmerica);
    }
}

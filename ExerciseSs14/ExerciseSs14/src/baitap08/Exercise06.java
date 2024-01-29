package baitap08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Exercise06 {
    public static void main(String[] args) {
        String string = "2013/09/13";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        try {
            LocalDate localDate = LocalDate.parse(string,dateTimeFormatter);

            System.out.println(localDate);

        }catch (Exception e){
            System.out.println("lỗi");
        }

    }

    }

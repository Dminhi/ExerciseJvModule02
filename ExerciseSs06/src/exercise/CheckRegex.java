package exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập email");
        String email = scanner.nextLine();
        boolean check = email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        System.out.println(check);
    }
}

package exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập email");
        String email = scanner.nextLine();
        boolean check = Pattern.matches("^(?:(?!\\.\\s)[\\w.-]+)@([A-Za-z0-9]+)\\.\\s([A-Za-z0-9]+)\\.\\s([A-Za-z0-9]+)$\n",email);
    }
}

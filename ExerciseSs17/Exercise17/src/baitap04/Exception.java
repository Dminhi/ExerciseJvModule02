package baitap04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi");
        String string = scanner.nextLine();
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
        try {Integer.parseInt(string.charAt(i)+"");
        list.add(Integer.parseInt(string.charAt(i)+""));;
        } catch (NumberFormatException e){
            list.add(i,0);
            System.out.println("có 1 ký tự không phải số nguyên được thay thế = 0.");
        }
        }
        System.out.println(list);
    }
}

package baitap15;

import javax.swing.*;
import java.util.*;

public class findStringLongest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự");
        String string = scanner.nextLine();
//        TreeMap<String,Integer> tempString = null;
        List<String> newList = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i == string.length() -1) {
                temp.append(string.charAt(string.length() - 1));
                newList.add(String.valueOf(temp));
            } else {
                char a = string.charAt(i);
                char b = string.charAt(i+1);
                if (a < b) {
                    temp.append(string.charAt(i));
                } else {
                    temp.append(string.charAt(i));
                    newList.add(String.valueOf(temp));
                    temp = new StringBuilder();
                }
            }
        }
        System.out.println(newList);
        StringBuilder max = new StringBuilder(newList.get(0));
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i).length() > max.length()) {
                max = new StringBuilder(newList.get(i));
            }
        }
        System.out.println(max);
    }
}

package exercise;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập độ dài của từ ngắn nhất");
        int number = scanner.nextInt();
        String abc = "My mother is a person I admire most. She devoted a lot of time and energy to the upbringing of my two brothers and 1. Despite working hard, she always made time to teach us many useful things which are necessary and important in our later lives";
        int count = 0;
        int count1 = 0;
        String [] word = abc.split("\\s+");
        for (int i = 0; i < word.length; i++) {
            if(word[i].length()>number){
                System.out.println(word[i]);
                count1++;
            }
            count++;
        }
        System.out.println("Số lượng từ dài hơn "+number+" là "+count1);
        System.out.println("Số lượng từ trong đoạn văn là "+count);


    }
}

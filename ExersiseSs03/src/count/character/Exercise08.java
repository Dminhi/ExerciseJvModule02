package count.character;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
countCharacter();
    }
    public  static void countCharacter (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Điền ký tự cần tìm");
        char character = scanner.nextLine().charAt(0);
        String str = "không biết ghi gì cả";
        int count = 0;
        // Dùng vòng lặp lặp qua từng ký tự trong string
        // Xét điều kiện rồi tăng giá trị lên 1 khi điều kiện đúng
        for (int i = 0; i < str.length(); i++) {
        if(str.charAt(i)==(character)){
            count+=1;
        }
        }
        System.out.println("Số ký "+character+" trong string là "+count);

    }
}

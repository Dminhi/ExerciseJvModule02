package ra.bussiness.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static boolean isValidString(String input) {
        // Mẫu biểu thức chính quy: B(\d{3})
        // Bắt đầu bằng B, sau đó là 3 chữ số
        String regex = "B\\d{3}";

        // Tạo Pattern
        Pattern pattern = Pattern.compile(regex);

        // Tạo Matcher
        Matcher matcher = pattern.matcher(input);

        // Kiểm tra xem chuỗi có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }
    public static boolean isValidAuthor(String input) {
        // Mẫu biểu thức chính quy: B(\d{3})
        // Bắt đầu bằng B, sau đó là 3 chữ số
        String regex = "A\\d{3}";

        // Tạo Pattern
        Pattern pattern = Pattern.compile(regex);

        // Tạo Matcher
        Matcher matcher = pattern.matcher(input);

        // Kiểm tra xem chuỗi có khớp với biểu thức chính quy hay không
        return matcher.matches();
    }
}

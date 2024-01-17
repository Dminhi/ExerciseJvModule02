package exercise;

public class ReplaceMethod {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("duyan2708");
        stringBuffer.replace(0,5,"lananh");
        System.out.println(stringBuffer);

        String string = "My first visit to Nha Trang, the coastal city, was three years ago. " +
                "It was a pleasant and memorable trip. Nha Trang, the capital of Khanh Hoa province," +
                " has one of the most popular municipal beaches in all of Vietnam." +
                " In Nha Trang, nature beauties are so tempting.";

        System.out.println(string.replace(" s"," t"));
    }
}

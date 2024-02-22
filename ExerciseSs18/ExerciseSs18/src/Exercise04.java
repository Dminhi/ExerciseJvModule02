import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise04 {
    public static String reverseString(String text) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(text);
        ObjectInputStream ois = new ObjectInputStream(fis);
        String string = (String) ois.readObject();
        return string;
    }
    static String strings = "";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String string = reverseString("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/text.txt");
        String [] arr = string.split(" ");
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            String temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        String reverseString = Arrays.toString(arr);
        reverseString = reverseString.replaceAll(",","");
        reverseString = reverseString.replace("[","");
        reverseString = reverseString.replace("]","");
        strings=reverseString;
        writeString("text2.txt");

    }
    public static boolean writeString(String text) throws IOException {
        FileOutputStream fos = new FileOutputStream(text);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(strings);
        return true;
    }
}

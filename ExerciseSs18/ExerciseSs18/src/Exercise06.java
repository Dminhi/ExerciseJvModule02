import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise06 {
    public static String readingText(String text) throws IOException {
        FileReader fileReader = new FileReader(text);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;
        string = (String) bufferedReader.readLine();
        return string;
    }

    public static void main(String[] args) throws IOException {
        String [] arr = readingText("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/text.txt").split(" ");
        HashMap<String,Integer> text = new HashMap<>();
        for (String string : arr) {
            text.put(string,text.getOrDefault(string,0)+1);
        }
        int max = 0;
        String most = null;
        for (Map.Entry<String,Integer> entry: text.entrySet()){
            int number = entry.getValue();
            if(number>max){max = number;most = entry.getKey();}
        }
        if(most !=null){
            System.out.println("Phần tử xuất hiện nhiều nhất là " + most);
            System.out.println("Tần xuất xuất hiện là "+ max);
        }else {
            System.out.println("Mảng rỗng");
        }
    }
}

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Exercise05 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/src/countries.csv"));
        List<CountTries> list = new ArrayList<>();
        String string;

        while ((string = bufferedReader.readLine())!=null){
            String [] arr = string.split(",");
            int id = Integer.parseInt(arr[0]);
            String code = arr[1];
            String name = arr[2];
            CountTries countTries = new CountTries(id,code,name);
           list.add(countTries);
        }
        for (CountTries countTries : list) {
            System.out.println(countTries);
        }
    }
}

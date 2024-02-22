import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exercise03 {
    public static String readText(String text) throws IOException, ClassNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(text);
            ois = new ObjectInputStream(fis);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return (String) ois.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String string = readText("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/text.txt");
        System.out.println(string);
        String [] arr = string.split(" ");
        String flag = "";
        int check=0;
        for (String s : arr) {
            if(s.length()>check){
                check = s.length();
                flag = s;
            }
        }
        System.out.println(check);
        System.out.println(flag);
    }
}

import java.io.*;

public class Exercise07 implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/text.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println((String)ois.readObject());
        ois.close();
    }
}

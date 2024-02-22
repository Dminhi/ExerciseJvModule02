import java.io.*;

public class Exercise02 {
    public static void copyFile(String data, String nextData) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fis = new FileInputStream(data);
            ois = new ObjectInputStream(fis);
            fos = new FileOutputStream(nextData);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ois.readObject());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        copyFile("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/text.txt","/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/text1.txt");
    }
}

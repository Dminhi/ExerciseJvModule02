import java.io.*;

public class Exercise01 {
    public static String readingText(String text) throws ClassNotFoundException {
        File file = new File(text);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String string = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            string = (String) ois.readObject();
            ois.close();
        } catch (EOFException | FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string;
    }
    public static boolean writeText(String text) throws IOException {
        File file = new File(text);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        String string = "Viết chương trình đọc nội dung từ file text và hiển thị số lượng từ trong file đó";
        fos = new FileOutputStream(file);
        oos = new ObjectOutputStream(fos);
        oos.writeObject(string);
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeText("text.txt");
        System.out.println(readingText("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/text.txt"));
    }
}
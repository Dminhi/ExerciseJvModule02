package ra.bussiness.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static final String BOOK_PATH = "src/ra/bussiness/data/book.txt";
    public static final String AUTHOR_PATH = "src/ra/bussiness/data/author.txt";
    public static <T> void  writeToFile(String path, List<T> list){
        File file = new File(path);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static <T> List<T> readFromFile(String path){
        File file = new File(path);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<T> list = new ArrayList<>();
        try{
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            list = (List<T>) ois.readObject();
            ois.close();
        }catch (EOFException | FileNotFoundException e){

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return list;
    }
}
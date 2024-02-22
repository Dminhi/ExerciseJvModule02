package Exercise08;

import java.io.*;
import java.util.List;

public class ProductFile {
    public static boolean writeToFile(String path,List<Product> products) throws IOException {
        File file = new File(path);
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return true;
    }
}

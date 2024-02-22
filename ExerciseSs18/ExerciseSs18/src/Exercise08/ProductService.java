package Exercise08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    static List<Product> productList = new ArrayList<>();
    public static void addProductToFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm muốn thêm");
        byte number = Byte.parseByte(scanner.nextLine());
        for (int i = 1; i <=number ; i++) {
            Product product = new Product();
            product.inputData();
            productList.add(product);
        }
        ProductFile.writeToFile("/Users/dminhi/Desktop/Minh JV221103/Module02/Exercise/ExerciseSs18/ExerciseSs18/src/Exercise08/data/data.txt",productList);
    }

    public static void main(String[] args) throws IOException {
        addProductToFile();
    }
}

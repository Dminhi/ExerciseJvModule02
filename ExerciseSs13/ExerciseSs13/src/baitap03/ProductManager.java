package baitap03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    List<Product> products = new ArrayList<>();
    public int idProduct = 1;
    public void createProduct(){
        Product product =new Product();
        product.inputData(sc);
        products.add(product);
        product.setId(idProduct++);
        System.out.println("Thêm mới sản phẩm thành công");
    }
    public void readProduct(){
        for (Product product : products) {
            product.disPlaydata();
        }
    }
    public void updateProduct(Scanner sc){
        System.out.println("Nhập id sản phẩm cần xoá");
        int idDelete = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if(idDelete == product.getId()){
                System.out.println("Thay đổi thông tin sản phẩm");
                product.inputData(sc);
            }
        }
    }
    public void deleteProduct(Scanner sc){
        System.out.println("Nhập id sản phẩm cần xoá");
        int idDelete = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if(idDelete == product.getId()){
                products.remove(product);
            }
        }
    }

    public void findByName (Scanner sc){
        System.out.println("Nhập tên tìm kiếm");
        String findName = sc.nextLine();
        for (Product product : products) {
            if(product.getProductName().contains(findName.toLowerCase())){
                product.disPlaydata();
            };
        }
    }
    public void sortByPrice(){
        products.sort(((o1, o2) -> o1.getProductPrice()- o2.getProductPrice()));
        readProduct();
    }
    public void sortByName(){
        products.sort((o1, o2) -> o1.getProductName().compareTo(o2.getProductName()));
        readProduct();
    }
}
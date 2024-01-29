package baitap03;

import java.util.Scanner;

public class Product {
    private int id;
    private String productName;
    private int productPrice;

    public Product() {
    }

    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public void  inputData(Scanner sc){
        System.out.println("Điền tên sản phẩm");
        this.productName = sc.nextLine();
        System.out.println("Điền giá sản phẩm");
        this.productPrice = Integer.parseInt(sc.nextLine());
    }
    public void disPlaydata(){
        System.out.printf("Id : %s || Tên sản phẩm : %s || Giá sản phẩm : %s \n", id,productName,productPrice);
    }
}

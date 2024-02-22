package Exercise08;

import java.io.Serializable;
import java.util.Scanner;

public class Product implements Serializable {
    int code, productPrice;
    String productName, productBrand, detail;

    public Product() {
    }

    public  Product(int code, int productPrice, String productName, String productBrand, String detail) {
        this.code = code;
        this.productPrice = productPrice;
        this.productName = productName;
        this.productBrand = productBrand;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product[" +
                "code: " + code +
                ", productPrice: " + productPrice +
                ", productName: '" + productName + '\'' +
                ", productBrand: '" + productBrand + '\'' +
                ", detail: '" + detail + '\'' +
                ']';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm");
        this.code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        this.productName = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        this.productPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập thương hiệu sản phẩm");
        this.productBrand = scanner.nextLine();
        System.out.println("Nhập chi tiết sản phẩm");
        this.detail = scanner.nextLine();
    }
    public void displayData(){
        System.out.println("-----------------------");
        System.out.printf("| %4s | %15s | %10s | %15s | %10s |\n",code,productName,productPrice,productBrand,detail);
    }

}

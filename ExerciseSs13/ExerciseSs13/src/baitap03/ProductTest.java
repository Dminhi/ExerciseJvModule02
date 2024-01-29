package baitap03;

import java.util.Scanner;

public class ProductTest {
    private static ProductManager productManager = new ProductManager();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("=======================MENU======================");
            System.out.println("1. Hiển thị danh sách sản phẩm ");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Sửa thông tin sản phẩm theo id");
            System.out.println("4. Xóa theo id");
            System.out.println("5. tim kiem theo ten");
            System.out.println("6. Hiển thị theo giá tăng dần");
            System.out.println("0. thoát");
            System.out.println("-------------------------------------------------");
            System.out.println("Nhập lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    productManager.readProduct();
                    break;
                case 2:
                    productManager.createProduct();
                    break;
                case 3:
                    productManager.updateProduct(sc);
                    break;
                case 4:
                    productManager.deleteProduct(sc);
                    break;
                case 5:
                    productManager.findByName(sc);
                    break;
                case 6:
                    productManager.sortByPrice();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.err.println("Nhập không hợp lệ");
            }
        }
    }
}

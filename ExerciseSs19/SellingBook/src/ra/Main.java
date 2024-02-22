package ra;

import ra.bussiness.util.InputMethods;
import ra.presentation.AuthorManagement;
import ra.presentation.BookManagement;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("---------Menu-----------");
            System.out.println("0. Thoát");
            System.out.println("1. Quản lý tác giả");
            System.out.println("2. Quản lý sách");
            System.out.println("Nhập chức năng");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình");
                    return;
                case 1:
                    AuthorManagement.authorController();
                    break;
                case 2:
                    BookManagement.bookController();
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }
}

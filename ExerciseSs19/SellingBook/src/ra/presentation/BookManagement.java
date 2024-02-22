package ra.presentation;

import ra.bussiness.model.Book;
import ra.bussiness.service.IBookService;
import ra.bussiness.service.implement.BookServiceImpl;
import ra.bussiness.util.InputMethods;

public class BookManagement {
    public static IBookService bookService = new BookServiceImpl();

    public static void bookController() {
        while (true) {
            System.out.println("--------MENU-----------");
            System.out.println("1. Hiển thị danh sách");
            System.out.println("2. Thêm mới sách");
            System.out.println("3. Sửa danh sách sách");
            System.out.println("4. Xoá sách");
            System.out.println("6. Hiển thị thông tin sách theo id");
            System.out.println("5. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    displayBook();
                    break;
                case 2:
                    addNewBooks();
                    break;
                case 3:
                    updateBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    return;
                case 6:
                    displayBookById();
                    break;
                default:
                    System.err.println("Mời nhập không hợp lệ");
            }
        }
    }

    public static void displayBook() {
    if (bookService.displayAll().isEmpty()){
        System.err.println("Danh sách rỗng");
    }
        System.out.println("Danh sách sách");
        System.out.printf("| %4s | %10s | %15s | %5s |\n","ID","Name","Publisher","Price");
    bookService.displayAll().forEach(Book::displayData);
    }

    public static void addNewBooks(){
        System.out.println("Số lượng sách cần thêm");
        byte quantity = InputMethods.getByte();
        for (int i = 1; i <=quantity ; i++) {
            System.out.println("Nhập thông tin cho sách thứ " + i);
            Book newBook = new Book();
            newBook.inputData(true);
            bookService.updateById(newBook);
        }
        System.out.println("Đã thêm mới "+ quantity + " cuốn sách");
    }

    public static void updateBook(){
        System.out.println("Nhập id sách cần sửa");
        String idBook = InputMethods.getString();
        Book editBook = bookService.findById(idBook);
        if (editBook == null){
            System.err.println("Không tồn tại id");
            return;
        }
        System.out.println("Thông tin danh sách cũ");
        editBook.displayData();
        System.out.println("Nhập thông tin mới");
        editBook.inputData(false);
        bookService.updateById(editBook);
        System.out.println("Cập nhật thành công");
    }
    public static void deleteBook(){
        System.out.println("Nhập id sách cần xoá");
        String idDeleteBook = InputMethods.getString();
        Book deleteBook = bookService.findById(idDeleteBook);
        if(deleteBook == null){
            System.err.println("Không tồn tại Id");
            return;
        }
        bookService.deleteById(idDeleteBook);
        System.out.println("Xoá thành công");
    }
    public static void displayBookById(){
        System.out.println("Nhập id cần hiển thị");
        String idDisplayBook = InputMethods.getString();
        Book displayBook = bookService.findById(idDisplayBook);
        if(displayBook==null){
            System.err.println("Không tìm thấy id");
        } else {
            System.out.println("Thông tin sách có id "+ idDisplayBook);
            displayBook.displayData();
        }
    }
}

package ra.presentation;

import ra.bussiness.model.Author;
import ra.bussiness.model.Book;
import ra.bussiness.service.IAuthorService;
import ra.bussiness.service.implement.AuthorServiceimpl;
import ra.bussiness.util.InputMethods;

public class AuthorManagement {
    public static IAuthorService authorService = new AuthorServiceimpl();

    public static void authorController() {
        while (true) {
            System.out.println("--------MENU-----------");
            System.out.println("1. Hiển thị danh sách tác giả");
            System.out.println("2. Thêm mới tác giả");
            System.out.println("3. Sửa danh sách tác giả");
            System.out.println("4. Xoá tác giả");
            System.out.println("5. Hiển thị thông tin tác giả theo id");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 0:
                    System.out.println("Thoát chương trình");
                    return;
                case 1:
                    displayAuthor();
                    break;
                case 2:
                    addNewAuthors();
                    break;
                case 3:
                    updateAuthor();
                    break;
                case 4:
                    deleteAuthor();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
        }
    }
    public static void displayAuthor(){
        if (authorService.displayAll().isEmpty()){
            System.err.println("Danh sách rỗng");
            return;
        }
        System.out.println("Danh sách tác giả");
        System.out.printf("| %4s | %10s | %10s | %15s |\n","ID","Name","Age","Hometown");
        authorService.displayAll().forEach(Author::displayData);
    }
    public static void addNewAuthors(){
        System.out.println("Số lượng tác giả cần thêm");
        byte quantity = InputMethods.getByte();
        for (int i = 1; i <=quantity ; i++) {
            System.out.println("Nhập thông tin tác gỉa thứ " + i);
            Author newAuthor = new Author();
            newAuthor.inputData(true);
            authorService.updateById(newAuthor);
            System.out.println();
        }
        System.out.println("Đã thêm mới "+quantity+" tác giả");
    }
    public static void updateAuthor(){
        System.out.println("Nhập id tác giả cần sửa");
        String idAuthor = InputMethods.getString();
        Author editAuthor = authorService.findById(idAuthor);
        if(editAuthor==null){
            System.out.println("Không tồn tại id");
            return;
        }
        System.out.println("Danh sách tác giả cũ");
        editAuthor.displayData();
        System.out.println("Nhập thông tin tác giả mới");
        editAuthor.inputData(false);
        authorService.updateById(editAuthor);
        System.out.println("Cập nhật thành công");
    }

    public static void deleteAuthor(){
        System.out.println("Nhập id tác giả cần xoá");
        String idAuthor = InputMethods.getString();
        Author deleteAuthor = authorService.findById(idAuthor);
        if (deleteAuthor==null){
            System.out.println("Không tồn tại id");
            return;
        }
        authorService.deleteById(idAuthor);
        System.out.println("Xoá thành công");

    }

}

package ra.bussiness.model;

import ra.bussiness.service.implement.AuthorServiceimpl;
import ra.bussiness.util.InputMethods;
import ra.bussiness.util.Validate;
import ra.presentation.AuthorManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements IOData, Serializable {
    private String id, titleBook, publisher, price;
    private List<Author> author = new ArrayList<>();

    public Book() {
    }

    public Book(String id, String titleBook, String publisher, String price, List<Author> author) {
        this.id = id;
        this.titleBook = titleBook;
        this.publisher = publisher;
        this.price = price;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public void inputData(boolean isAdd) {
        if (isAdd) {
            while (true) {
                System.out.println("Nhập mã sách");
                this.id = InputMethods.getString();
                if (Validate.isValidString(id)) {
                    break;
                } else {
                    System.out.println("Nhập không đúng mới nhập lại");
                }
            }
        }
        System.out.println("Nhập tên sách");
        this.titleBook = InputMethods.getString();


        System.out.println("Danh sách tác giả");
        AuthorServiceimpl authorList = new AuthorServiceimpl();
        authorList.displayAll().forEach(Author::displayData);
        while (true) {
            System.out.println("1. Thêm tác gỉa");
            System.out.println("2. Thoát");
            System.out.println("Nhap lua chon");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    System.out.println("Nhập id tác giả sách");

                    String idAuthor = InputMethods.getString();
                    for (Author author : authorList.displayAll()) {
                        if (author.getIdAuthor().equals(idAuthor)) {
                            this.author.add(author);
                        }
                    }
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Mời nhập lại");
            }
            if(choice==2){
                break;
            }
        }


        System.out.println("Nhập nhà xuất bản sách");
        this.publisher = InputMethods.getString();
        System.out.println("Nhập giá tiền");
        this.price = InputMethods.getString();
    }

    @Override
    public void displayData() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %4s | %10s | %15s | %5s | \n", id, titleBook, publisher, price);
        System.out.print("Authors : ");
        for (Author a : this.author) {
            System.out.print(a.getNameAuthor() + " ");
        }
        System.out.println();
    }
}

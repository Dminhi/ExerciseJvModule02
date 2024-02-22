package ra.bussiness.model;

import ra.bussiness.util.InputMethods;
import ra.bussiness.util.Validate;

import java.io.Serializable;

public class Author implements IOData, Serializable {


    String idAuthor, ageAuthor, nameAuthor, homeTown;

    public Author() {
    }

    public Author(String idAuthor, String ageAuthor, String nameAuthor, String homeTown) {
        this.idAuthor = idAuthor;
        this.ageAuthor = ageAuthor;
        this.nameAuthor = nameAuthor;
        this.homeTown = homeTown;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

    public String getAgeAuthor() {
        return ageAuthor;
    }

    public void setAgeAuthor(String ageAuthor) {
        this.ageAuthor = ageAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public void inputData(boolean isAdd) {
        while (true) {
            System.out.println("Nhập id tác giả");
            this.idAuthor = InputMethods.getString();
            if (Validate.isValidAuthor(idAuthor)){break;}
            else {
                System.out.println("Nhập không đúng mới nhập lại");
            }
        }
        System.out.println("Nhập tên tác giả");
        this.nameAuthor = InputMethods.getString();
        System.out.println("Nhập tuổi tác giả");
        this.ageAuthor = InputMethods.getString();
        System.out.println("Nhập quê quán tác giả");
        this.homeTown = InputMethods.getString();
    }

    @Override
    public void displayData() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %4s | %10s | %10s | %15s | \n", idAuthor, nameAuthor, ageAuthor, homeTown);
    }

}

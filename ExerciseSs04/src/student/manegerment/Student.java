package student.manegerment;

import java.util.Scanner;

public class Student {
    private String idStudent;
    private String nameStudent;

    private int age;

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int
                               age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Boolean gender;

    private String address;
    private String phoneNumber;

    public Student(){}

    public Student(String idStudent, String nameStudent, int age, Boolean gender, String address, String phoneNumber) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner sc){
        if(idStudent==null){
            System.out.println("Nhập id : ");
            this.idStudent = sc.nextLine();
        }
        System.out.println("Nhập tên : ");
        this.nameStudent = sc.nextLine();
        System.out.println("Nhập tuổi : ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính : ");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập địa chỉ : ");
        this.address = sc.nextLine();
        System.out.println("Nhập số điện thoại : ");
        this.phoneNumber = sc.nextLine();
    }

    public String displayData(){
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';

    }

    public static Student[]students=new Student[0];

    public void addNewStudent(Scanner sc) {
        // Nhập số lượng cần thêm
        System.out.println("Nhập số lượng cần thêm");
        int n = Integer.parseInt(sc.nextLine());
        // tạo mảng mới và copy giá trị cũ
        Student[] newStudents = new Student[students.length+n];
        for (int i = 0; i < students.length; i++) {
            newStudents[i]=students[i];
        }
        for (int i = 0; i < n; i++) {
            Student newStudent = new Student();
            newStudent.inputData(sc);
            newStudents[students.length+i]=newStudent;
        }
        students = newStudents;
    }
    public void showAllStudent() {
        if(students.length==0){
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách học sinh");
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i].displayData());
            }
        }
    }
    public void updateStudent(Scanner sc) {
        // Nhập id cần sửa
        System.out.println("Nhập id cần sửa : ");
        String id = sc.nextLine();
        int indexById = findIndexById(id);
        if(indexById !=-1){
            // Nhập thêm tin mới
            System.out.println("Thông tin cũ");
            System.out.println(students[indexById]);
            students[indexById].inputData(sc);
            System.out.println("Cập nhật thành công");
        } else {
            System.out.println("Id không tìm thấy");
        }
    }
    public int findIndexById(String id){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getIdStudent().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public void deleteStudent(Scanner sc) {
        // Nhập id cần sửa
        System.out.println("Nhập id cần xoá : ");
        String id = sc.nextLine();
        int indexById = findIndexById(id);
        if(indexById !=-1){
            Student [] newStudent = new Student[students.length-1];
            for (int i = 0; i < newStudent.length; i++) {
                if(i<indexById){
                    newStudent[i]=students[i];
                }
                else if(i>indexById){
                    newStudent[i-1]=students[i];
                }
                students = newStudent;
                System.out.println("Xoá thành công");
            }
        } else {
            System.out.println("id không tìm thấy");
        }
    }
}

package test.student;

import student.manegerment.Student;

import java.util.Scanner;

public class TestStudent {
    public static Student student = new Student();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("---------Menu----------");
            System.out.println("1. Show all students");
            System.out.println("2. Add new students");
            System.out.println("3. Edit student");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1:
                    // Hiển thị
                    student.showAllStudent();
                    break;
                case 2:
                    student.addNewStudent(sc);
                    break;
                case 3:
                    student.updateStudent(sc);
                    break;
                case 4:
                    student.deleteStudent(sc);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter your choice");
            }
        }
    }
}

package employee.manegerment;

import java.util.Scanner;

public class Employee {
    public  String employeeId;
    public  String employeeName;
    public  int age;
    public  Boolean gen;
    public  double rate;
    public  double salary;

    public Employee() {
    }
    public Employee(String employeeId, String employeeName, int age, Boolean gen, double rate ) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = this.rate*1300000;
    }

    public void inputData(Scanner scanner){
        System.out.println("Hãy điền id");
        this.employeeId=scanner.nextLine();
        System.out.println("Hãy điền tên");
        this.employeeName=scanner.nextLine();
        System.out.println("Hãy điền tuổi");
        this.age=Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy điền giới tính");
        this.gen=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Hãy điền tỷ suất lương");
        this.rate=Double.parseDouble(scanner.nextLine());
    }

    public String displayData() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gen=" + gen +
                ", rate='" + rate + '\'' +
                ", salary='" + calSalary() + '\'' +
                '}';
    }
    public double calSalary (){
        return  this.salary=this.rate*1300000;
    }



}

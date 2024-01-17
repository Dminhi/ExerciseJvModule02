package test.Employee;

import employee.manegerment.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employee = new  Employee[5];
        for (int i = 0; i < employee.length; i++) {
            Employee newEmployee = new Employee();
            newEmployee.inputData(scanner);
            employee[i]=newEmployee;
            System.out.println(employee[i].displayData());
        }

//        System.out.println(Arrays.toString(employee));
//        Employee employee = new Employee("ep01","minh",23,true,1);
//        Employee employee1 = new Employee("ep02","duc",27,true,1.8);
//        Employee employee2 = new Employee("ep03","thinh",32,true,1.6);
//        Employee employee3 = new Employee("ep04","hung",18,true,2.1);
//        Employee employee4 = new Employee("ep05","vinh",21,true,1.7);


//        System.out.println(employee.displayData());
        }

    }


package test.quadratic;

import quadratic.equation.QuadraticEquation;

import java.util.Scanner;

public class TestQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập giá trị a");
        double a = sc.nextDouble();
        System.out.println("Hãy nhập giá trị b");
        double b = sc.nextDouble();
        System.out.println("Hãy nhập giá trị c");
        double c = sc.nextDouble();
        QuadraticEquation findX = new QuadraticEquation(a,b,c);
        if (findX.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        } else if (findX.getDiscriminant()==0) {
            System.out.println("Giá trị của x là " + findX.getRoot3());
        } else {
            System.out.println("X có 2 gía trị là " + findX.getRoot1()+" và "+findX.getRoot2());
        }


    }


}

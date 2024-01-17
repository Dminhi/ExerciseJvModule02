package test;

import myclass.MyClass;

public class TestMyClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getMyString());
        myClass.setMyString("abc");
        System.out.println(myClass);
    }
}

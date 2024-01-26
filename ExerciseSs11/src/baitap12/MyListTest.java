package baitap12;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        Mylist <Integer> mylist = new Mylist<>();
        mylist.add(0,5);
        mylist.add(0,6);
        mylist.add(2,7);
        mylist.add(2,10);
        mylist.add(3,11);
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        mylist.remove(1);
        System.out.println("--------------------");
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println("--------------------");
        System.out.println("clone");
        Mylist<Integer> cloneMyList = mylist.clone();
        for (int i = 0; i < cloneMyList.size(); i++) {
            System.out.println(cloneMyList.get(i));
        }
        System.out.println("IndexOf");
        System.out.println(mylist.indexOf(10));
        System.out.println("Contain");
        System.out.println(mylist.contains(10));
        System.out.println("clear");
        mylist.clear();
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}

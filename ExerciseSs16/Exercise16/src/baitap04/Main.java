package baitap04;

import baitap07.Generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoolballTeam> list = new ArrayList<>();
        list.add(new FoolballTeam(1,"Phấn Đào",23,99));
        list.add(new FoolballTeam(2,"LiverPool",23,80));
        list.add(new FoolballTeam(3,"ManCity",23,86));
        list.add(new FoolballTeam(4,"Mân Đàn",23,90));
        // Bubble Sort
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = list.size()-1; j > i ; j--) {
//                if(list.get(j).getScore()>list.get(j-1).getScore()){
//                    FoolballTeam temp = list.get(j);
//                    list.set(j,list.get(j-1));
//                    list.set(j-1,temp);
//                }
//            }
//        }
//        list.forEach(System.out::println);
        // Selection Sort
//        int min;
//        for (int i = 0; i < list.size()-1; i++) {
//            min = i;
//            for (int j = 1; j <list.size() ; j++) {
//                if(list.get(min).getScore()>list.get(j).getScore()){
//                    min = j;
//                }
//                if(min!=j){
//                    FoolballTeam temp = list.get(j);
//                    list.set(j,list.get(j-1));
//                    list.set(j-1,temp);
//                }
//            }
//        }
//        list.forEach(System.out::println);
        // Insertion Sort
        int y;
        for (int i = 0; i < list.size(); i++) {
            FoolballTeam x = list.get(i);
            y=i;
            while (y>0&&x.getScore()>list.get(y-1).getScore()){
                list.set(y,list.get(y-1));
                y--;
            }
            list.set(y,x);
        }
        list.forEach(System.out::println);
    }
}

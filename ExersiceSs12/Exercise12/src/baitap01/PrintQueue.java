package baitap01;

import java.util.*;

public class PrintQueue {


    public static void main(String[] args) {
        Queue priorityQueue = new PriorityQueue() {
        };
        Queue arrayDeque = new ArrayDeque(){};

        priorityQueue.offer(1);
        priorityQueue.add(2);
        System.out.println(priorityQueue);
        Collection queue = new PriorityQueue<>();
    }

}

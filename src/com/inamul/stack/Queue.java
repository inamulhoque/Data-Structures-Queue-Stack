package com.inamul.stack;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queue = new LinkedList<>();
    public void addQ(int data){
        queue.addLast(data);
    }
    public void display() {
        System.out.println("Queue elements are:");
        for (Integer i : queue) {
            System.out.println(" "+i);
        }
    }
}

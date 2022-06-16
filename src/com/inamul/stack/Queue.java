package com.inamul.stack;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queue = new LinkedList<>();
    public void addQ(int data){
        queue.addLast(data);
    }
    public void Dequeue(){
        if (queue.size() != 0) {
            queue.pop();
            System.out.println("Popped");
        } else {
            System.out.println("Empty queue.");
        }
    }
    public void display() {
        if (queue.size() != 0) {
            System.out.println("Queue elements are:");
            for (Integer i : queue) {
                System.out.println(" " + i);
            }
        } else {
            System.out.println("Queue is empty.");
        }
    }
}

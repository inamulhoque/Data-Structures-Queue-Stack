package com.inamul.stack;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> linkedList= new LinkedList<>();
    public void insert(int data){
        linkedList.addFirst(data);
    }
    public void peak(){
        System.out.println("Peak element is: "+linkedList.peek());
    }
    public void pop(){
        if (linkedList.size() != 0){
            linkedList.pop();
            System.out.println("Pop operation performed.");
        } else{
            System.out.println("Empty Stack.");
        }
    }
    public void display(){
        if (linkedList.size() != 0) {
            System.out.println("Stack elements are: ");
            for (Integer i : linkedList) {
                System.out.println(i);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

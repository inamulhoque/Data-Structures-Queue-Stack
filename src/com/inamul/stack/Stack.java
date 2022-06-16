package com.inamul.stack;

import java.util.LinkedList;

public class Stack {
    static LinkedList<Integer> linkedList= new LinkedList<>();
    public static void insert(int data){
        linkedList.addFirst(data);
    }
    public static void display(){
        for (Integer i:linkedList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        insert(70);
        insert(30);
        insert(56);
        display();
    }
}

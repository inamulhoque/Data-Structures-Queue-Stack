package com.inamul.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.insert(70);
        stack.insert(30);
        stack.insert(56);
        stack.display();
        stack.peak();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();
    }
}

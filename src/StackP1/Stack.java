/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackP1;

/**
 *
 * @author THANG
 */
import java.util.Scanner;

public class Stack {

    private int[] items;
    private int top;

    public Stack(int capacity) {
        this.items = new int[capacity];
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }

        this.items[++this.top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return this.items[this.top--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return this.items[this.top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.items.length - 1;
    }

    public int top() {
        return this.items[this.top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element of the stack: " + stack.peek());

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Is the stack full? " + stack.isFull());

        System.out.println("Elements in the stack: ");
        for (int item : stack.items) {
            System.out.println(item);
        }
    }
}
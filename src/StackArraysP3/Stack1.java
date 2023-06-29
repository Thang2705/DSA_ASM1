/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackArraysP3;

/**
 *
 * @author THANG
 */
class Stack1 {
  private int[] data;
  private int top;

  public Stack1 (int capacity) {
    data = new int[capacity];
    top = -1;
  }

  public void push(int item) {
    if (top == data.length - 1) {
      throw new RuntimeException("Stack is full");
    }

    top++;
    data[top] = item;
  }

  public int pop() {
    if (top == -1) {
      throw new RuntimeException("Stack is empty");
    }

    int item = data[top];
    top--;
    return item;
  }

  public boolean isEmpty() {
    return top == -1;
  }
}
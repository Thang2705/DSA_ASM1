/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackLinkedListP3;

/**
 *
 * @author THANG
 */
class Stack {
  private Node top;

  public void push(int item) {
    Node newNode = new Node(item);
    newNode.next = top;
    top = newNode;
  }

  public int pop() {
    if (top == null) {
      throw new RuntimeException("Stack is empty");
    }

    int item = top.data;
    top = top.next;
    return item;
  }

  public boolean isEmpty() {
    return top == null;
  }
}

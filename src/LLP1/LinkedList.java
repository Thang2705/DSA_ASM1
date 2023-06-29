/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLP1;

/**
 *
 * @author THANG
 */
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    private Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void insertAtMiddle(int data, int position) {
        Node newNode = new Node(data);
        Node current = head;
        int count = 1;

        while (count < position - 1) {
            current = current.next;
            count++;
        }

        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;
    }

    public void delete(int data) {
        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (previous == null) {
            head = current.next;
        } else {
            previous.next = current.next;
        }
    }

    public void deleteAtBeginning() {
        if (head == null) {
            return;
        }

        head = head.next;
    }

    public void deleteAtEnd() {
        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            head = null;
        } else {
            previous.next = null;
        }
    }

    public void deleteAtMiddle(int position) {
        Node current = head;
        int count = 1;

        while (count < position - 1) {
            current = current.next;
            count++;
        }

        Node temp = current.next;
        current.next = temp.next;
    }

    public void search(int data) {
        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data not found");
        } else {
            System.out.println("Data found: " + current.data);
        }
    }
    
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

    }

    private Node getMiddle() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private void merge(Node left, Node right) {
        Node newHead = null;
        Node current = newHead;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }

            current = current.next;
        }

        if (left != null) {
            current.next = left;
        } else {
            current.next = right;
        }

        head = newHead.next;
    }

    public void printLinkedList() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.printLinkedList();
        
        linkedList.insertAtBeginning(1);
        
        linkedList.printLinkedList();
        
        linkedList.insertAtEnd(2);
        
        linkedList.printLinkedList();
        
        linkedList.insertAtMiddle(1,0);
        
        linkedList.printLinkedList();
       
        linkedList.deleteAtBeginning();
        
        linkedList.printLinkedList();
        
        linkedList.deleteAtEnd();
        
        linkedList.printLinkedList();
        
        linkedList.deleteAtMiddle(3);

        linkedList.search(2);

        linkedList.sort();

        linkedList.printLinkedList();
    }
}
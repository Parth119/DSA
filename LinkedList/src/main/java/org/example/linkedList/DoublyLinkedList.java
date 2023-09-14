package org.example.linkedList;

import org.example.node.Node;

public class DoublyLinkedList<T> {
    Node<T> head = null;

    public void insert(T data) {
        Node<T> pointer = new Node<>(data);
        if (head == null) {
            head = pointer;
        } else {
            pointer.next = head;
            head.previous = pointer;
            head = pointer;
        }
        System.out.println("Node inserted at first :"+data);
    }

    public void insertLast(T data) {
        Node<T> pointer = new Node<>(data);
        if (head == null) {
            head = pointer;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = pointer;
            pointer.previous=temp;
        }
        System.out.println("Node inserted at last :"+data);
    }

    public void insert(Integer position, T data) {
        Node<T> pointer = head;
        for(int i=0;i<position;i++){
            pointer = pointer.next;
            if(pointer==null){
                System.out.println("Entered number is breaking boundary :<");
                return;
            }
        }
        Node<T> newNode = new Node<>(data);

        newNode.next=pointer.next;
        newNode.previous=pointer;

        pointer.next = newNode;
        pointer.next.previous = newNode;

        System.out.println("Node inserted at " + position + " position.");
    }

    public void delete(T data) {
        System.out.println("Node deleted from first");
    }

    public void deleteLast(T data) {
        System.out.println("Node deleted from last");
    }

    public void delete(Integer position, T data) {
        System.out.println("Node deleted from " + position + " position.");
    }

    public void update(Integer position, T data) {
        System.out.println("Node updated from " + position + " position.");
    }

    public void display() {
        System.out.print("Content of List : ");
        if (head != null) {
            Node<T> pointer = head;
            while (pointer != null) {
                System.out.print(pointer.data + " ");
                pointer = pointer.next;
            }
        } else {
            System.out.println("List is empty!!");
        }
    }
}

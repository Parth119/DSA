package org.example.linkedList;

import org.example.node.SingleTraverseNode;

public class SinglyLinkedList<T> {
    SingleTraverseNode<T> head = null;
    SingleTraverseNode<T> tail = null;

    public void addNode(T data){
        SingleTraverseNode<T> newNode = new SingleTraverseNode<>(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void displayData(){
        SingleTraverseNode<T> nodeCurrent = head;
        if(head == null){
            System.out.println("List is Empty!!");
            return;
        }
        System.out.print("Nodes of singly Linked List :");
        while(nodeCurrent != null){
            System.out.print(nodeCurrent.data+" ");
            nodeCurrent = nodeCurrent.next;
        }
        System.out.println();
    }

    public void deleteRecord(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        System.out.println("record deleted");
    }

    public void updateRecord(T shouldBeFound, T toBeUpdated){
        SingleTraverseNode<T> current = head;
        if(current==null){
            System.out.println("List empty!");
        }
        while(current!=null){
            if(current.data == shouldBeFound){
                current.data = toBeUpdated;
                System.out.println("Datas are updated"+shouldBeFound+" to: "+toBeUpdated);
                return;
            }
            current = current.next;
        }
    }
}

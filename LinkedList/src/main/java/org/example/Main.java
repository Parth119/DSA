package org.example;

import org.example.linkedList.DoublyLinkedList;
import org.example.linkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

//        SinglyLinkedList<Integer> integerList = new SinglyLinkedList<>();
//        integerList.addNode(2);
//        integerList.addNode(3);
//        integerList.addNode(4);
//        integerList.displayData();
//        integerList.deleteRecord();
//        integerList.displayData();
//        System.out.println();
//        SinglyLinkedList<String> stringList = new SinglyLinkedList<String>();
//        stringList.addNode("You");
//        stringList.addNode("OOnly");
//        stringList.addNode("Live");
//        stringList.addNode("Once");
//        stringList.displayData();
//        stringList.updateRecord("OOnly","Only");
//        stringList.deleteRecord();
//        stringList.displayData();
        DoublyLinkedList<String> dStringList = new DoublyLinkedList<>();
        dStringList.display();
        dStringList.insert("Is");
        dStringList.insert("Htrap");
        dStringList.insertLast("OP");
        dStringList.insert(0,"Hey");
        dStringList.display();
    }
}
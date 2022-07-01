package com.linkedlist;

public class Operations {

    public static void pushAtStart(){
        LinkedList linkedList =new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("This is after Pushing Data: ");
        linkedList.print();
    }
    public static void appendData() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        System.out.println("This is after Appending Data");
        linkedList.print();
    }
}

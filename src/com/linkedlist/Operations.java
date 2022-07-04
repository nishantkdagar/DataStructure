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
    public static void insertInBetween(){
        LinkedList linkedList=new LinkedList();
        Node second =linkedList.push(70);
        Node first =linkedList.push(56);
        Node newNode =new Node(30);
        System.out.println("Inserting Data in between Linked List");
        System.out.println("Before");
        linkedList.print();
        linkedList.insertInBetween(first,newNode);
        System.out.println("After");
        linkedList.print();
    }

    public static void pop(){
        LinkedList linkedList=new LinkedList();
        Node first= linkedList.push(70);
        Node second= linkedList.push(30);
        Node third=linkedList.push(56);
        System.out.println("Deleting Node from Starting");
        System.out.println("Before");
        linkedList.print();
        linkedList.pop();
        System.out.println("After");
        linkedList.print();
    }
    public static void removeFromEnd(){
        LinkedList linkedList=new LinkedList();
        Node first= linkedList.push(70);
        Node second= linkedList.push(30);
        Node third=linkedList.push(56);
        System.out.println("Deleting Node from End");
        System.out.println("Before");
        linkedList.print();
        linkedList.removeFromEnd();
        System.out.println("After");
        linkedList.print();
    }
    public static void search(){
        LinkedList linkedList=new LinkedList();
        Node firstNode= linkedList.push(70);
        Node secondNode= linkedList.push(30);
        Node newNode=linkedList.push(56);
        System.out.println("Searching for Nodes In List");
        System.out.println("Nodes in List are");
        linkedList.print();
        linkedList.search(5);

    }
}

package com.linkedlist;

public class LinkedList {
    public static void main(String[] args) {
    System.out.println("Welcome to Data Structures, We will be working with Linked List");
    Node first=new Node(56);
    Node second=new Node(30);
    Node third=new Node(70);

    Node head=first;
    first.next=second;
    second.next=third;
    Node tail =third;

    Node temp = head;
    while(temp!=null){
        System.out.println(temp.data);
        temp =temp.next;
    }

}
}

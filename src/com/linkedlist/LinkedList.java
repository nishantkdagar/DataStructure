package com.linkedlist;

public class LinkedList {
    Node head, tail;

    public Node push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            this.tail.next = newNode;
            tail = newNode;
        }
    }
    public void insertInBetween(Node previousNode ,Node newNode){
        Node temp = previousNode.next;
        previousNode.next = newNode;
        newNode.next = temp;
    }
    public void pop() {
        Node temp = head;
        head = temp.next;
        temp = null;
    }
    public void removeFromEnd() {
        if (head.next == null)
            head = null;
        else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void search(int searchNode)
    {
        if(head.data == searchNode)
            System.out.println(searchNode + " Exists");
        else
        {
            Node temp=head;

            boolean exists=false;

            while(temp!=null)
            {
                if(temp.data == searchNode)
                {
                    exists = true;
                    break;
                }

                temp=temp.next;
            }
            if(exists == true)
                System.out.println(searchNode+ " Exists");
            else
                System.out.println("There is no such node in the list");
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("There's nothing in the linked list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}

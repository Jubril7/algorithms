package org.example;


import org.w3c.dom.Node;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    //Insert into the linkedList
    public void insert(int data) {
        NodesType newNode = new NodesType(data);
        if(head == null) {
            head = (Node) newNode;
        } else {
            NodesType current = (NodesType) head;
            while(current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }

    }

    //Loop through a linked list(---->)
    public void traverse() {
        NodesType current = (NodesType) head;
        while(current != null) {
            System.out.println(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.print("Linked List: ");
        list.traverse();
    }

}

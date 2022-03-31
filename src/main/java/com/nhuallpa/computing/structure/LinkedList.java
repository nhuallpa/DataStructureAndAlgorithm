package com.nhuallpa.computing.structure;

public class LinkedList {

    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public int size() {
        var length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.getNext();
        }
        return length;
    }

    public void deleteFromHead() {
        if (head != null) {
            head = head.getNext();
        }
    }
    public Integer find(int data) {
        Node current = head;

        Integer result = null;

        while (current != null) {
            if (data == current.getData()) {
                result = current.getData();
            }
            current = current.getNext();
        }
        return result;
    }

    public String toString() {
        String result = "{";
        Node current = head;

        while (current != null) {
            result += current.toString() + ",";
            current = current.getNext();
        }

        result += "}";
        return result;
    }

}


package com.nhuallpa.computing.structure;

public class DoubleLinkedList {

    private DoubleLinkedNode head;

    public void insertAtHead(int data) {
        DoubleLinkedNode newNode = new DoubleLinkedNode(data);
        newNode.setNextNode(head);
        if (this.head != null) {
            head.setPreviousNode(newNode);
        }
        head = newNode;
    }

    public int length() {
        var length = 0;
        DoubleLinkedNode current = head;

        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
    }
}

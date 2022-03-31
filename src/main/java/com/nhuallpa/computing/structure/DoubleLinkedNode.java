package com.nhuallpa.computing.structure;

public class DoubleLinkedNode {

    private int data;
    public DoubleLinkedNode nextNode;
    public DoubleLinkedNode previousNode;

    public DoubleLinkedNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoubleLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleLinkedNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleLinkedNode previousNode) {
        this.previousNode = previousNode;
    }
}

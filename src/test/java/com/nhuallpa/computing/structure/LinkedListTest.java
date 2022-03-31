package com.nhuallpa.computing.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void size() {
        var list = new LinkedList();

        list.insertAtHead(2);
        list.insertAtHead(6);

        assertEquals(2, list.size());
    }

    @Test
    public void deleteFromHead() {
        var list = new LinkedList();

        list.insertAtHead(2);
        list.insertAtHead(6);
        list.deleteFromHead();

        assertEquals(1, list.size());
    }

    @Test
    public void find() {
        var list = new LinkedList();

        list.insertAtHead(2);
        list.insertAtHead(6);
        list.insertAtHead(9);

        assertEquals(6, list.find(6));
    }


}
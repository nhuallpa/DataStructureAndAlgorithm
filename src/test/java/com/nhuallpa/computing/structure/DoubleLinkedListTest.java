package com.nhuallpa.computing.structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    @Test
    public void size() {

        var list = new DoubleLinkedList();
        list.insertAtHead(1);
        list.insertAtHead(8);
        list.insertAtHead(6);
        list.insertAtHead(4);

        assertEquals(4, list.length());

    }

}
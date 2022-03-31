package com.nhuallpa.computing.structure.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void insert() {
        var tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(8);
        assertEquals(8, tree.find(8).getData());
    }

    @Test
    void find() {
        var tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(5);
        assertEquals(5, tree.find(5).getData());
    }

    @Test
    void delete() {

        var tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(5);
        tree.delete(5);
        assertNull(tree.find(5));

    }
}
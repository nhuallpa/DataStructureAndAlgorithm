package com.nhuallpa.computing.structure.tree;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(Integer data) {
        if (root == null) {
            this.root = new TreeNode(data);
        } else root.insert(data);
    }

    public TreeNode find(Integer data) {
        if (root != null)
            return root.find(data);
        return null;
    }

    public void delete(Integer data) {

        boolean isLeftChild = false;
        TreeNode current = this.root;
        TreeNode parent = this.root;

        if (root == null) return;

        while (current != null && data != current.getData()) {
            parent = current;
            if (data < current.getData()) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRigthChild();
                isLeftChild = false;
            }
        }

        if (current == null) {
            return;
        }

        if (current.getLeftChild() == null && current.getRigthChild() == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    parent.setLeftChild(null);
                } else {
                    parent.setRigthChild(null);
                }
            }
        }


    }


}

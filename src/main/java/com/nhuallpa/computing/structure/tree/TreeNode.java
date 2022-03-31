package com.nhuallpa.computing.structure.tree;

public class TreeNode {

    private Integer data;
    private TreeNode leftChild;
    private TreeNode rigthChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public TreeNode find(Integer data) {
        if (this.data == data) return this;
        if (data < this.data && leftChild != null) return leftChild.find(data);
        if (rigthChild != null) return rigthChild;
        return null;
    }


    public void insert(Integer data) {
        if (data >= this.data) {
            if (this.rigthChild == null) {
                this.rigthChild = new TreeNode(data);
            } else {
                this.rigthChild.insert(data);
            }
        } else {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data);
            }
        }
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRigthChild() {
        return rigthChild;
    }

    public void setRigthChild(TreeNode rigthChild) {
        this.rigthChild = rigthChild;
    }
}



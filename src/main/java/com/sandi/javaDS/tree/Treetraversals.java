package com.sandi.javaDS.tree;

public class Treetraversals {

    public void inOrder(Node root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void preOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String...args){
        Treetraversals treetraversals = new Treetraversals();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        treetraversals.inOrder(node);
        System.out.println("");
        treetraversals.preOrder(node);
        System.out.println("");
        treetraversals.postOrder(node);
    }

}

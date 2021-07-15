package com.sandi.javaDS.tree;

import org.junit.Test;

public class TraversalsTest {

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

    @Test
    void shouldTest(){
        TraversalsTest traversalsTest = new TraversalsTest();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);

        traversalsTest.inOrder(node);
        System.out.println("");
        traversalsTest.preOrder(node);
        System.out.println("");
        traversalsTest.postOrder(node);
    }

}

class Node {

    public int data;

    public Node left;
    public Node right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }

}

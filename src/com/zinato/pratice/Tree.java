package com.zinato.pratice;

public class Tree {

  private Node root;
  public static void main(String[] args) {

    Tree tree = new Tree();
    tree.root = new Node(1);
    tree.root.leftChild = new Node(2);
    tree.root.rightChild = new Node(3);

    System.out.println(tree.root.rightChild.value);
  }
}

class Node {
  int value;
  Node leftChild;
  Node rightChild;

  public Node(int value) {
    this.value = value;
    this.leftChild = null;
    this.rightChild = null;
  }

}

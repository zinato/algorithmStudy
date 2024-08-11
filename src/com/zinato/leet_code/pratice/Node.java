package com.zinato.leet_code.pratice;

import java.util.LinkedList;

public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        System.out.println(node1.value + " : " + node1.next.value);
        LinkedList<Integer> list = new LinkedList<>();
    }
}

package com.zinato.leet_code;


public class BrowserHistory {

  class Node {
    String val;
    Node next;
    Node prev;

    public Node(String val) {
      this.val = val;
      next = null;
      prev = null;
    }

    public Node(String val, Node prev) {
      this.val = val;
      this.next = null;
      this.prev = prev;
    }
  }

  Node head;
  //  Node tail;
  Node current;

  public BrowserHistory(String homepage) {
    head = new Node(homepage);
    current = head;
//    tail = head;
  }

  public void visit(String url) {
    current.next = new Node(url, current);
    current = current.next;
  }

  public String back(int steps) {

    while (steps > 0 && current.prev != null) {
      steps--;
      current = current.prev;
    }

    return current.val;
  }

  public String forward(int steps) {
    while (steps > 0 && current.next != null) {
      steps--;
      current = current.next;
    }
    return current.val;
  }

}

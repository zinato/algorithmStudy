package com.zinato.pratice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSPratice {




//  static List<String> BFS(TreeNode root) {
//    List<String> list = new ArrayList<>();
//    Queue<TreeNode> queue = new LinkedList<>();
//    queue.add(root);
//    while (!queue.isEmpty()) {
//      TreeNode currentNode = queue.poll();
//      list.add(currentNode.value);
//      System.out.println(currentNode.value);
//
//      if (currentNode.left != null) {
//        queue.add(currentNode.left);
//      }
//      if (currentNode.right != null) {
//        queue.add(currentNode.right);
//      }
//    }
//    return list;
//  }


  public static void preOrder(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.value + "->");
    preOrder(root.left);
    preOrder(root.right);

  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode("A");
    root.left = new TreeNode("B");
    root.right = new TreeNode("C");
    root.left.left = new TreeNode("D");
    root.left.right=new TreeNode("F");
    root.left.left.left = new TreeNode("E");

    List<String> bfs = BFSPratice.BFS(root);
    bfs.stream().forEach(System.out::println);
//    preOrder(root);

  }

  static List<String> BFS(TreeNode root) {
    if (root == null) return null;
    List<String> visited = new ArrayList<>();//방문 기록
    Queue<TreeNode> queue = new LinkedList<>(); //방문할 리스트

    queue.add(root);
    while(!queue.isEmpty()) {
      TreeNode currentNode = queue.poll();
      System.out.println("currentNode = " + currentNode.value);
      visited.add(currentNode.value);
      if (currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }


    return visited;
  }


}

class TreeNode {
  String value;
  TreeNode left;
  TreeNode right;

  public TreeNode(String value) {
    this.value = value;
    left = null;
    right = null;
  }
}



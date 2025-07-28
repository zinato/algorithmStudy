//package com.zinato.pratice;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class BFS {
//
//  public static List<TreeNode> printLevelOrder(TreeNode root) {
//    //queue 선언, 앞으로 순회할 정보를 저장할 queue
//    Queue<TreeNode> queue = new LinkedList<>();
//    //순회 정보를 저장
//    List<TreeNode> list = new ArrayList<>();
//    //root 저장
//    queue.add(root);
//    while(!queue.isEmpty()) {
//      //queue의 최신 data를 현재 노드를 가리킴,
//      TreeNode currentNode = queue.poll();
//      list.add(currentNode);
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
//
//  public static void main(String[] args) {
//    TreeNode root = new TreeNode("A");
//    root.left = new TreeNode("B");
//    root.right = new TreeNode("C");
//    root.left.left = new TreeNode("D");
//    root.left.right = new TreeNode("E");
//    root.right.left = new TreeNode("F");
//    root.right.right = new TreeNode("G");
//    List<TreeNode> treeNodes = BFS.printLevelOrder(root);
//    treeNodes.stream().forEach(t -> System.out.println(t.data));
//  }
//
//}
//
//
//class TreeNode {
//  String data;
//  TreeNode left, right;
//
//  public TreeNode(String data) {
//    this.data = data;
//    this.left = null;
//    this.right = null
//    ;
//  }
//
//}

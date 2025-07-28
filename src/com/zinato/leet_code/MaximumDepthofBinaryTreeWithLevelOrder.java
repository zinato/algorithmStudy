package com.zinato.leet_code;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTreeWithLevelOrder {

  static class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int v) {
      this.value = v;
    }
  }
  public int maxDepth(TreeNode root) {
    int maxDepth = 0;
    if (root == null) return maxDepth;
    //Level Order 탐색으로 풀이
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()) {
      int size = queue.size();
      maxDepth++;
      while(size-- > 0) {
        TreeNode currentNode = queue.poll();
        if (currentNode.left != null) {
          queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
          queue.add(currentNode.right);
        }
      }
    }
    return maxDepth;
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    MaximumDepthofBinaryTreeWithLevelOrder solution = new MaximumDepthofBinaryTreeWithLevelOrder();
    System.out.println(solution.maxDepth(root));
  }

}

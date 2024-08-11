package com.zinato.leet_code;


public class MaximumDepthOfBinaryTreeWithPostOrder {

  static class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int value) {
      this.value = value;
    }
  }

  public int maxDepth(TreeNode root){
    if (root == null) return 0;
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left,right) + 1;
  }


  public static void main(String[] args) {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    MaximumDepthOfBinaryTreeWithPostOrder solution = new MaximumDepthOfBinaryTreeWithPostOrder();
    System.out.println(solution.maxDepth(root));
  }

}

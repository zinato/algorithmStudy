package com.zinato.leet_code;

public class LowestCommonAncestor_236 {
  /**
   * Definition for a binary tree node.
   * public class TreeNode {
   *     int val;
   *     TreeNode left;
   *     TreeNode right;
   *     TreeNode(int x) { val = x; }
   * }
   */

  //postorder 활용하여 풀기
  /*
       1. 나 자신이 p 나 q 면 return 자기 자신(root)
       2. left and right 가 값이 있으면 return 자기 자신
        left 가 null이면 return right, right 가 null 이면 return left;
       3. 둘다 null이면 return root;
  */
//  public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
//    if (root == null) return null;
//
//    TreeNode left = LCA(root.left, p, q);
//    TreeNode right = LCA(root.right, p, q);
//
//    if (root == p || root == q) {
//      return root;
//    } else if (left == null) {
//      return right;
//    } else if (right == null) {
//      return left;
//    } else {
//      return root;
//    }
//  }

  public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null || root == p || root == q) {
      return root;
    }

    TreeNode left = LCA(root.left, p, q);
    TreeNode right = LCA(root.left, p, q);

    if (left == null) {
      return right;
    } else if (right == null) {
      return left;
    } else  {
      return root;
    }
  }


  public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

}

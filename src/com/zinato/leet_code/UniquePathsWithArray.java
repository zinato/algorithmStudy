package com.zinato.leet_code;

public class UniquePathsWithArray {

  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        dp[i][j] = -1;
      }
    }
    return helper(0,0, m-1,n-1,dp);
  }

  private int helper(int i, int j, int r, int c, int[][] dp) {
    if (i == r && j == c) {
      return 1;
    }
    if (dp[i][j] != -1) {
      return dp[i][j];
    }
    int count = 0;
    if (i < r)
      count += helper(i+1, j, r, c, dp);
    if (j < c)
      count += helper(i, j+1, r, c, dp);

    dp[i][j] = count;

    return dp[i][j];
  }

  public static void main(String[] args) {
    UniquePathsWithArray u = new UniquePathsWithArray();
    System.out.println(u.uniquePaths(3,7));
  }
}

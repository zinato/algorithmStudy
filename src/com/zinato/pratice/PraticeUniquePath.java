package com.zinato.pratice;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class PraticeUniquePath {

  /**
   *
    m x n grid
   grid[0][0] ~ grid[m-1][n-1]
   grid move : only right and down
   로봇이 갈 수 있는 최단 거리 모든 경우의 수 ~> DP 고려
   테스트 케이스는 최대 2 * 10^9 = 완전 탐색 사용 불가
   1 <= m, n <= 100


   input : m = 3, n = 7


   */

  Map<Point, Integer> memo = new HashMap<>();

//  private int helper(int m, int n, int i, int j) {
//
//    if (i == m-1 && j == n-1){
//      memo.put(new Point(i,j), 1);
//      return memo.get(new Point(i,j));
//    }
//    int count = 0;
//    if (!memo.containsKey(new Point(i,j))) {
//      if (i < m) {
//        count += helper(m, n, i+1, j);
//      }
//      if (j < n) {
//        count += helper(m,n, i, j+1);
//      }
//      memo.put(new Point(i,j), count);
//    }
//
//    return memo.get(new Point(i,j));
//
//  }

  //  public int helper(int r, int c, int[][] memo) {
//    if (r == 0 && c == 0) {
//      memo[r][c] = 1;
//      return memo[r][c];
//    }
//
//    int count = 0;
//    if (memo[r][c] != -1) {
//      return memo[r][c];
//    }
//    if (r - 1 >=0) {
//      count += helper(r -1, c, memo);
//    }
//    if (c -1 >=0) {
//      count += helper(r, c-1, memo);
//    }
//
//    memo[r][c] = count;
//
//
//    return memo[r][c];
//  }

  //Memoization Using HashMap
  public int uniquePaths(int m, int n) {
    int[][] memo = new int[m][n];
    for (int i = 0; i < m; i++) {
      memo[i][0] = 1;
    }
    for (int i = 0; i < n; i++) {
      memo[0][i] = 1;
    }
    for (int i =1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        memo[i][j] = memo[i-1][j] + memo[i][j-1];
      }
    }
    return memo[m-1][n-1];
  }



  public static void main(String[] args) {
    PraticeUniquePath pup = new PraticeUniquePath();
    System.out.println(pup.uniquePaths(3,7));

  }



}

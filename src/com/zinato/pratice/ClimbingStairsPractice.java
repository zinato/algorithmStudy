package com.zinato.pratice;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairsPractice {

//memoization 적용
//  Map<Integer, Integer> memo = new HashMap<>();
//  public int climbingStairs(int n) {
//    if (n == 1) return 1;
//    if (n == 2) return 2;
//    memo.put(1, 1);
//    memo.put(2, 2);
//    if (!memo.containsKey(n)) {
//      memo.put(n, climbingStairs(n-2) + climbingStairs(n-1));
//    }
//    return memo.get(n);
//  }

  public int climbingStairs(int n) {
    if (n == 0 || n == 1)
      return 1;
    int[] memo = new int[n+1];
    memo[0] = memo[1] = 1;
    for (int i = 2; i <= n; i++) {
      memo[i] = memo[i-2] + memo[i-1];
    }
    return memo[n];
  }
  public static void main(String[] args) {
    ClimbingStairsPractice c = new ClimbingStairsPractice();
    System.out.println(c.climbingStairs(2));
  }

}

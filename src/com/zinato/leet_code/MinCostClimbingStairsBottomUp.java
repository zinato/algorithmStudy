package com.zinato.leet_code;

public class MinCostClimbingStairsBottomUp {

  public int minCost(int[] cost) {
    int n = cost.length;
    int[] memo = new int[n+1];
    memo[0] = 0;
    memo[1] = 0;
    for (int i = 2; i < n+1; i++) {
      memo[i] = Math.min(cost[i-1] + memo[i-1], cost[i-2] + memo[i-2]);
    }
    return memo[n];
  }

  public static void main(String[] args) {
    int[] cost = {1,100,1,1,1,100,1,1,100,1};
    MinCostClimbingStairsBottomUp bu = new MinCostClimbingStairsBottomUp();
    System.out.println(bu.minCost(cost));

  }

}

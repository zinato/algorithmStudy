package com.zinato.leet_code;

import java.util.HashMap;

public class MinCostClimbingStairs {

  private HashMap<Integer, Integer  > memo  = new HashMap<>();

  public int minCost(int[] cost) {
   return dp(cost, cost.length);
  }

  private int dp(int[] cost, int index) {
    if (index == 0 || index == 1) {
      return 0;
    }
    if (!memo.containsKey(index)) {
      memo.put(index,
          Math.min(dp(cost, index-1) + cost[index-1],
              dp(cost, index-2) + cost[index-2]));
    }

    return memo.get(index);
  }

  public static void main(String[] args) {
    int[] cost = {1,100,1,1,1,100,1,1,100,1};
//    int[] cost = {10};

    MinCostClimbingStairs mccs = new MinCostClimbingStairs();
    System.out.println(mccs.minCost(cost));
  }
}

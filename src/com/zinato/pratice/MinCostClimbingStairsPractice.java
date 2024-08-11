package com.zinato.pratice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinCostClimbingStairsPractice {
  Map<Integer, Integer> memo = new HashMap<>();
  public int minConstClimbingStairs(int[] cost) {
    return dfs(cost, cost.length);
  }

  private int dfs(int[] cost, int index) {

    if (index == 0 || index ==1) {
      return 0;
    }
    if (!memo.containsKey(index)) {
      memo.put(index,
          Math.min(dfs(cost, index-1) + cost[index-1], dfs(cost, index-2) + cost[index-2]));
    }
    return memo.get(index);

  }

  public static void main(String[] args) {
    int cost[] = {
        10,15,20
    };
    MinCostClimbingStairsPractice m = new MinCostClimbingStairsPractice();
    System.out.println(m.minConstClimbingStairs(cost));
  }

}

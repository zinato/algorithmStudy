package com.zinato.leet_code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClimbingStairs {

  Map<Integer, Integer> memo = new HashMap<>();
  public static void main(String[] args) {
    ClimbingStairs cs = new ClimbingStairs();
    System.out.println(cs.climbStairs(44));
  }
  public int climbStairs(int n) {

    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    if (!memo.containsKey(n)) {
      memo.put(n, climbStairs(n-1) + climbStairs(n-2));
    }

    return memo.get(n);



  }
}

package com.zinato.leet_code;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public class UniquePaths {

  Map<Point, Integer> memo = new HashMap<>();

  public int uniquePaths(int m, int n) {
    return helper(m-1,n-1);
  }
  private int helper(int r, int c) {
    if (r == 0 && c == 0) {
      memo.put(new Point(0,0), 1);
      return memo.get(new Point(0,0));
    }
    int count = 0;
    if (!memo.containsKey(new Point(r, c))) {
      if (r-1 >= 0) {
        count += helper(r - 1, c);
      }
      if (c-1>= 0) {
        count += helper(r, c - 1);
      }
      memo.put(new Point(r,c), count);
    }

    return memo.get(new Point(r, c));
  }

  public static void main(String[] args) {
    UniquePaths uniquePaths = new UniquePaths();
    System.out.println(uniquePaths.uniquePaths(3,5));
  }

}

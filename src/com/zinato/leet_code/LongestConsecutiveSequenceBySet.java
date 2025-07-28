package com.zinato.leet_code;

import java.util.HashSet;

/**
 * @see <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">LongestConsecutiveSequenceBySort</a>
 *
 */
public class LongestConsecutiveSequenceBySet {

  public int longestConsecutive(int[] nums) {

    if (nums.length == 0) return 0;

    int max = 0;
    int cnt = 1;

    HashSet<Integer> set = new HashSet<>();
    for (int n : nums) {
      set.add(n);
    }
    for (int n : set) {
      if (!set.contains(n-1)) {
        cnt = 1;
        int target  = n + 1;
        while (set.contains(target)) {
          target++;
          cnt++;
        }
      }
      if (cnt > max) max = cnt;
    }

    return max;
  }

  public static void main(String[] args) {
    LongestConsecutiveSequenceBySet solution = new LongestConsecutiveSequenceBySet();
    System.out.println(solution.longestConsecutive(new int[]{101, 102, 103, 104, 105, 4, 200, 1, 3, 2}));


  }


}

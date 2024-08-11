package com.zinato.leet_code;

import java.util.Arrays;


/**
 * @see <a href="https://leetcode.com/problems/longest-consecutive-sequence/description/">LongestConsecutiveSequenceBySort</a>
 *
 */
public class LongestConsecutiveSequenceBySort {
  public int longestConsecutive(int[] nums) {
    int max = 1;
    int count = 1;
    Arrays.sort(nums);

    if (nums.length == 0) return 0;

    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] + 1 == nums[i+1]) {
        count++;
      } else  if (nums[i] == nums[i+1]) {
        continue;
      } else {
        count = 1;
      }

      if (count > max) {
        max = count;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    LongestConsecutiveSequenceBySort lcsb = new LongestConsecutiveSequenceBySort();
    System.out.println(lcsb.longestConsecutive(new int[]{9,1,4,4,4,7,3,-1,0,5,8,-1,6}));
  }

}

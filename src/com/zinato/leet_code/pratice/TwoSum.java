package com.zinato.leet_code.pratice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i : nums) {
            int N = target - i;
            if (map.containsKey(N) && (map.get(N) != map.get(i))) {
                return new int[]{map.get(i), map.get(N)};
            }
        }
        return new int[]{};
    }

    public static boolean twoSumWithTwoPointer(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) {
                left += 1;
            } else if (sum > target) {
                right -= 1;
            }
            if (sum == target) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(twoSumWithTwoPointer(new int[]{2,1,5,7}, 4));


    }



}

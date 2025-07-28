package com.zinato.leet_code.pratice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumPratice {

    public static int[] twoSum(int[] nums, int target) {
        //two Pointer, sort
        //O(nlogn)
        Arrays.sort(nums);

        //left, right값 초기화
        int left = 0;
        int right = nums.length - 1;

        //left < right 일때까지 while loop
        while(left < right){
            int sum = nums[left] + nums[right];
            //sum < target left++
            if (sum < target) left +=1;
            //sum > target right--
            else if (sum > target) right +=1;
            //sum == target return true
            else if (sum == target) return new int[]{left, right};
        }
        //return false
        return new int[]{};


    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }
}

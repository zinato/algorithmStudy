package com.zinato.leet_code;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static int[] twoSum(int[] nums, int target) {

    //HashMap을 활용하여 문제 풀이 - 메모리 활용
    //시간복잡도 : O(n)

    HashMap<Integer, Integer> numMap = new HashMap<>();
    //HashMap을 Iterate 하면서 comeplement(target-array[i]) HashMap에 존재하는지 검사 && 인덱스 값 불일치
    for (int i = 0; i < nums.length; i++) {
      //보수
      int complement = target - nums[i];
      //containskey의 시간 복잡도는 hash function이 정상일 때 O(1)
      if (numMap.containsKey(complement) && numMap.get(complement) != i) {
        return new int[]{numMap.get(complement), i};
      }
      numMap.put(nums[i], i);

    }
    return new int[]{};
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
  }
}

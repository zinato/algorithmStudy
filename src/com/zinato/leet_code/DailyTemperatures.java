package com.zinato.leet_code;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {

  public int[] dailyTemperatures(int[] temp) {

    int n = temp.length;
    int[] answer = new int[n];
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
        while (!stack.empty() && temp[stack.peek()] < temp[i]) {
        int prev = stack.pop();
        answer[prev] = i - prev;
      }
      stack.push(i);
    }

    return answer;

  }

  public static void main(String[] args) {
    DailyTemperatures dailyTemperatures = new DailyTemperatures();
    int[] answer = dailyTemperatures.dailyTemperatures(new int[]{30,60,50,70}); // [1,1,2,1,0]
    System.out.println(Arrays.toString(answer));

  }

}

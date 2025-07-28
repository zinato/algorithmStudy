package com.zinato.leet_code.pratice;

import java.util.Arrays;
import java.util.Stack;

public class Pratice {
    public static void main(String[] args) {
        Pratice p = new Pratice();
        System.out.println(Arrays.toString(p.dailyTemperatures(new int[]{30,40,50,60})));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int curDay = 0; curDay < temperatures.length; curDay++) {
            while(!stack.isEmpty() && temperatures[curDay] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                answer[prevDay] = curDay - prevDay;
            }
            stack.push(curDay);
        }
        return answer;
    }
}

package com.zinato.leet_code.pratice;

import java.util.Stack;

public class DailyTemperatureP {
    public static void main(String[] args) {
        DailyTemperatureP practice = new DailyTemperatureP();
        practice.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});

    }
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int curDay = 0; curDay < temperatures.length; curDay++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[curDay]) {
                int prevDay = stack.pop();
                answer[prevDay] = curDay - prevDay;
            }
            stack.push(curDay);
        }

        return answer;

    }
}

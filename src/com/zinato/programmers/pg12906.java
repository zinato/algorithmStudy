package com.zinato.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class pg12906 {
    public static void main(String[] args) {
        pg12906 pg = new pg12906();
        pg.solution(new int[]{1,1,3,3,0,1,1});
    }
    public int[] solution(int[] arr) {
        int[] answer = {};
        LinkedList<Integer> queue =new LinkedList<>();
        int temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (temp == arr[i]) {
                continue;
            }
            queue.add(arr[i]);
            temp = arr[i];
        }
        answer = new int[queue.size()];
        for (int i = 0; i < queue.size(); i++) {
            answer[i] = queue.get(i);
        }
        return answer;
    }
}

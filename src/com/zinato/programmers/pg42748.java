package com.zinato.programmers;

import java.util.Arrays;

public class pg42748 {
    public static void main(String[] args) {
        pg42748 pg = new pg42748();
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2,5,3}, {4,4,1}, {1,7,3}};
        System.out.println(Arrays.toString(pg.solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        //1. arrayCopy를 사용하여 배열자르고 복사하기
        //2. 정렬
        //3. 정렬된 배열에서 k번째 인덱스 찾기
        for(int i = 0; i < commands.length; i++) {
            int[] command = commands[i];
            int from = command[0] - 1;
            int to = command[1];
            int index = command[2] - 1;

            int[] newArray = Arrays.copyOfRange(array, from, to);
            Arrays.sort(newArray);
            answer[i] = newArray[index];
        }

        return answer;
    }
}


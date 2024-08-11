package com.zinato.programmers;

import java.util.Stack;

public class pg181943 {
    public static void main(String[] args) {
        pg181943 pg = new pg181943();
        pg.solution("He11oWor1d", "lloWorl", 2);
    }
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length(), my_string.length());
        System.out.println(answer);
        return answer;
    }
}

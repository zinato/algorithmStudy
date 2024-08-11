package com.zinato.programmers;

public class pg81301 {
    public static void main(String[] args) {
        pg81301 pg = new pg81301();
        System.out.println(pg.solution("one4seveneight"));
    }

    public int solution(String s) {
        int answer = 0;
        String[] words = new String[]{
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        for (int i = 0; i < words.length; i++) {
            s= s.replace(words[i], String.valueOf(i));
        }
        return Integer.valueOf(s);
    }

}

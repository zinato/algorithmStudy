package com.zinato.programmers;

import java.util.HashMap;

public class pg120838 {
    //모스부호
    public static void main(String[] args) {
        pg120838 pg = new pg120838();
        String letter = ".... . .-.. .-.. ---";
        System.out.println(pg.decoding(letter));

    }
    public String solution(String letter) {
        String answer = "";
        return answer;
    }
    private String decoding(String letter) {
        String result = "";
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        HashMap<String, Character> map = new HashMap<>();
        int index = 97;
        for (String s : morse) {
            map.put(s, (char) index);
            index++;
        }

        String[] problem = letter.split(" ");
        for (String s : problem) {
            if (map.containsKey(s)) {
                result += map.get(s);
            }
        }
        return result;
    }
}

package com.zinato.programmers;

public class Test {

    public static void main(String[] args) {
        Test t = new Test();
        t.solution("qyyigoptvfb", "abcdefghijk", 3);
//        t.solution("q", "a", 3);

    }

    public String solution(String encrypted_text, String key, int rotation) {

        String temp = "";


        //로테이션을 양수면 왼쪽으로 음수면 오른쪽으로 로테이션
        if (rotation > 0) {
            temp = leftRotate(encrypted_text, rotation);
        } else if (rotation < 0) {
            rotation = -rotation;
            temp = rightRotate(encrypted_text, rotation);
        }
        return decryptedText(encrypted_text, key, temp);
    }
    //반대로 encrypted_text 길이 만큼 돌면서 rotate 된 temp 문자열을 암호화 반대로 key문자열을 통해 answer 구하기
    private String decryptedText(String encrypted_text, String key, String temp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < encrypted_text.length(); i++) {
            char changeText = (char) (temp.charAt(i) - (key.charAt(i) - 96));
            answer.append(changeLimitAlphabetLowerCase(changeText));
        }
        return answer.toString();
    }

    private char changeLimitAlphabetLowerCase(char changeText) {
        //a(97) 보다 숫자가 작으면 26을 더해줌
        //z(122)를 넘어가면 a(97)로 만들어주기 위해 26 빼줌
        if (changeText < 97) {
            changeText += 26;
        } else if (changeText > 122) {
            changeText -= 26;
        }
        return changeText;
    }

    private String rightRotate(String input, int n) {
        n = -n;
        for (int i = 0; i < n; i++) {
            String temp = input.substring(input.length() - 1);
            input = temp + input.substring(0, input.length() - 1);
        }
        System.out.println(input);
        return input;
    }

    private String leftRotate(String input, int n) {
        System.out.println(input);
        for (int i = 0; i < n; i++) {
            String temp = input.substring(0, 1);
            input = input.substring(1, input.length()) + temp;
        }
        System.out.println("leftRotate : " + input);
        return input;
    }
}

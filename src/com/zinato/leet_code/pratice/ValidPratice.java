package com.zinato.leet_code.pratice;

import java.util.Stack;

public class ValidPratice {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        //유효성 문제는 stack을 활용하여 문제풀이!
        // String s 를 char 배열에 저장
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c =='[') {
                stack.push(']');
            } else if (c =='{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
         }
        return stack.isEmpty();

    }
}

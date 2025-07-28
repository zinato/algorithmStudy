package com.zinato.leet_code;

import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    //유효성 문제는 stack 으로 접근!
    Stack<Character> stack = new Stack<>();
    //입력값이 open bracket이면 반대의 close bracket을 저장
    //입력값이 open bracket이 아닐때는 pop한 결과와 비교하여 다르면 false
    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.push(')');
      } else if (c == '[') {
        stack.push(']');
      } else if (c == '{') {
        stack.push('}');
        //close bracket이 제일 먼저 들어오는 경우 stack.isEmpty를 체크해줘야 함
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
    //stack을 전부 iterate 했는데 값이 남아있으면 False 없으면 true
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    ValidParentheses validParentheses = new ValidParentheses();
    System.out.println(validParentheses.isValid("()[]{"));
  }

}

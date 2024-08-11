package com.zinato.alco;

import java.util.*;
public class p_01_06 {

  public static String solution(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
      //indexOf는 문자열 중 가장 "첫번째" 발견된 자리만 리턴됨
      if (str.indexOf(str.charAt(i)) == i) {
        answer += str.charAt(i);
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println(solution(str));

  }

}

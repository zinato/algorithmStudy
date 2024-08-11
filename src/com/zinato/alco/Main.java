package com.zinato.alco;

import java.util.*;

public class Main {

  public static String solution(String str) {
    String answer = "";
    for (int i = 0; i < str.length(); i++) {
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

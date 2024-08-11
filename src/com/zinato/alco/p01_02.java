package com.zinato.alco;

import java.util.Scanner;

public class p01_02 {
  public static String solution(String str) {
    String answer = "";
//    for (char x : str.toCharArray()) {
//      if(Character.isLowerCase(x)) {
//        answer+= Character.toUpperCase(x);
//      }
//      else {
//        answer+=Character.toLowerCase(x);
//      }
//    }

    //ascii 문자로 풀기
    //소문자 65 ~ 90, 대문자 97 ~ 122, 대소문자 변환 32 차이임
    for (char x : str.toCharArray()) {
      if (x>= 65 && x <= 90) answer += (char)(x+32);
      else answer+= (char)(x -32);
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(solution(str));

  }

}

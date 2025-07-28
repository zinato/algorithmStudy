package com.zinato.alco;

import java.util.Scanner;

public class p_01_07 {

  public static String solution(String str) {
//    String answer = "YES";
//    str = str.toUpperCase();
//    int length = str.length() / 2;
//    for (int i = 0; i < length; i++) {
//      if (str.charAt(i) != str.charAt(str.length()-i-1)) {
//        answer = "NO";
//        return answer;
//      }
//    }
//    return answer;
    //use StringBuilder
    String answer = "NO";
    String tmp = new StringBuilder(str).reverse().toString();
    if (str.equalsIgnoreCase(tmp)) {
      answer = "YES";
      return answer;
    }
    return answer;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    System.out.println(solution(str));
  }

}

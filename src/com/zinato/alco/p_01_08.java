package com.zinato.alco;

import java.util.Scanner;

public class p_01_08 {

  public static String solution(String str) {
    String answer = "YES";
//    String ex = "found7, time: study; Yduts; emit, 7Dnuof";
    str = str.toUpperCase().replaceAll("[^A-Z]", "");

//    for (int i = 0; i < str.length()/2; i++) {
//      if (!(str.charAt(i) == str.charAt(str.length()-1-i))) {
//        answer = "NO";
//        return answer;
//      }
//    }
    //use stringBuilder
    String tmp = new StringBuilder(str).reverse().toString();
    if (!str.equalsIgnoreCase(tmp)) {
      answer = "NO";
      return answer;
    }
    return answer;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    System.out.println(solution(str));

  }

}

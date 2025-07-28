package com.zinato.alco;

import java.util.Scanner;

public class p_01_09 {

  /**
   * 0 -> 48
   * 9 -> 57
   *
   */
  public static int solution(String str) {
    int answer = 0;
    for (char c : str.toCharArray()) {
      if (c >= 48 && c <= 57) {
        answer = answer * 10 + (c - 48);
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    System.out.println(solution(str));
  }

}

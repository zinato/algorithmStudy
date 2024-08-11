package com.zinato.alco;

import java.util.Scanner;

public class p01_1 {

  public static int solution(String str, char c) {
    int answer = 0;

    char[] quizArray = str.toCharArray();
//    for (int i = 0; i < quizArray.length; i++) {
//      if (quizArray[i] == c) {
//        answer++;
//      }
//    }
    for(char quiz: quizArray) {
      if (quiz == c) {
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine().toUpperCase();
    char c = scanner.nextLine().toUpperCase().charAt(0);

    System.out.println(p01_1.solution(str, c));
  }

}

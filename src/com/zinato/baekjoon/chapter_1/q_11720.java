package com.zinato.baekjoon.chapter_1;

import java.util.Scanner;
public class q_11720 {

  /**
   * 백준 11720 숫자의 합 구하기
   *
   * !문자에서 숫자로 변환시 아스키 코드 값을 고려해야 함
   */

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //첫번째 줄 숫자의 개수를 받는 입력
    int N = sc.nextInt();
    //입력 받은 숫자
    String sNum = sc.next();
    //숫자 값을 charArray 로 변환 하여 모두 합산
    char[] cNum = sNum.toCharArray();
    int sum = 0;
    for (int i = 0; i < cNum.length; i++) {
      sum += cNum[i] - '0'; // 문자에서 숫자로 변환 시 아스키 코드 값이기 때문에  - 48 또는  - '0' 해줘야 함
    }
    System.out.println(sum);
  }

}

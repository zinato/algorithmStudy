package com.zinato.algorithm_100._14_countNum;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    /*
      문제 : 입력된 숫자의 개수를 출력하라
      입력 : 412314218
      0: 0
      1: 3
      2: 2
      3: 1
      4: 2
      5: 0
      6: 0
      7: 0
      8: 1
      9: 0
     */
    int n = 412314218;
    int[] countNum = new int[10];

    while (n > 0) {
      //n 을 10으로 나눈 나머지 값을 인덱스로 넣고 n을 10으로 나눠주는 것을 반복하면서 카운팅을 함
      countNum[n % 10]++;
      // n 을 10으로 나눠준 것을 n으로 대입함
      n /= 10;
    }

    for (int i = 0; i < countNum.length; i++) {
      System.out.println(i + ": " + countNum[i]);
    }


  }
}

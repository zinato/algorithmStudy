package com.zinato.algorithm_100._13_NumRec4_;

public class NumRec4 {
  /**
   * 문제 소개
   * 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
   * 4
   * 1 2 3 4
   * 2 4 6 8
   * 3 6 9 12
   * 4 8 12 16
   *
   * for, while
   */
  public static void main(String[] args) {
    //내가 푼 방식
    int n = 4;
    for (int i = 1; i < n+1; i++) {
      for (int j = 1; j < n+1; j++) {
        System.out.printf("%4d", i * j);
      }
      System.out.println();
    }

    System.out.println("===============================");

    //유툽
    int k = 4;
    int arr[][] = new int[k][k];

    for (int i = 0; i < k; i++) {
      for (int j = 0; j < k; j++) {
        arr[i][j] = (i + 1) * (j + 1);
      }
    }

    for (int i = 0; i < k; i++) {
      for (int j = 0; j < k; j++) {
        System.out.printf("%4d", arr[i][j]);
      }
      System.out.println();
    }




  }

}

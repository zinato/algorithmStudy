package com.zinato.baekjoon.chapter_1;

import java.util.Scanner;
public class q_1546 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //과목수를 받기
    int N = sc.nextInt();
    //점수를 1차원 배열에 저장한다.
    int A[] = new int[N];
    for (int i = 0; i < A.length; i++){
      A[i] = sc.nextInt();
    }
    //총합을 sum에 최대값을 max에 저장한다.
    long sum = 0;
    long max = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] > max) {
        max = A[i];
      }
      sum += A[i];
    }
    // sum * 100 / max / 3
    System.out.println(sum * 100.0 / max / N);


  }

}

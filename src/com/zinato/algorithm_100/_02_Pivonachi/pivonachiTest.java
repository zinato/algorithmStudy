package com.zinato.algorithm_100._02_Pivonachi;

public class pivonachiTest {

  public static void main(String[] args) {
    //An = An-1 + An -2 , n>=3
    //Array 방식
    int[] arr = new int[100];

    //1,2 항은 초기화
    arr[1] = 1;
    arr[2] = 1;

    for (int i = 3; i < 100; i++) {
      arr[i] = arr[i-1] + arr[i-2];
    }

    for (int i = 1; i < 11; i++) {
      System.out.print(arr[i] + " ");
    }



  }



}

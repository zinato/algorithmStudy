package com.zinato.algorithm_100._10_NumRec1_;


import java.util.Arrays;
import java.util.Scanner;

/*
  문제 소개
  - 입력된 수(N)만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
  문제 : 4
  정답 : 1 2 3 4
        5 6 7 8
        9 10 11 12
        13 14 15 16

 */
public class NumRec1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 : ");
    int inputNum = scanner.nextInt();

    int[][] arr = new int[inputNum][inputNum];
    int count = 1;
    for (int i = 0; i < inputNum; i++) {
      for (int j = 0; j < inputNum; j++) {
//        arr[i][j] = count++;
        System.out.printf("%4d", count++);
//        arr[i][j] = i * inputNum + j + 1; // 이 방식도 있음.
//        System.out.printf("%4d", i * inputNum + j +1);
      }
      System.out.println();
    }


//    System.out.println(Arrays.deepToString(arr));


  }
}

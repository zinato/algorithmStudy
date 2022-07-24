package com.zinato.algorithm_100._12_NumRec3_;


/**
 * 문제 소개
 * 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오
 * 4
 * 1 5 9 13
 * 2 6 10 14
 * 3 7 11 15
 * 4 8 12 16
 */
public class NumRec3 {
  public static void main(String[] args) {
//    int n = 4;
//    for (int i = 1; i < n + 1; i++) {
//      for (int j =0; j < n ; j++) {
//        System.out.print(i + j * n + " ");
//      }
//      System.out.println();
//    }
    int n = 4;
    int arr[][] = new int[4][4];

//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < n; j++) {
////        arr[i][j] =
//        arr[i][j] = (i+1) + (j * n);
////        System.out.print( (i+1) + (j * n));
//        System.out.printf("%3d", arr[i][j]);
//      }
//      System.out.println();
//    }
    int num = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[j][i] = num;
        num++;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.printf("%4d" , arr[i][j]);
      }
      System.out.println();
    }
  }
}

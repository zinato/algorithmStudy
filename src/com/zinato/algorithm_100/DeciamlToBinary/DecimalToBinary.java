package com.zinato.algorithm_100.DeciamlToBinary;

import java.util.Scanner;

public class DecimalToBinary {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("10 진수에서 2진수로 바꿀 숫자를 입력하세요 : ");

    int index = 0;

    //2진수로 변활된 값을 넣을 배열
    int[] binaryArray = new int[100];

    int mok = scanner.nextInt();

    // 아래 알고리즘이 핵심
    while(mok > 0) {
      binaryArray[index] = mok % 2;
      mok /= 2;
      index++;
    }

    //배열은 0부터 시작이기 때문에 연산에 의해 더해진 index 값에서 하나 뻬줘야함.
    index--;

    for(; index >= 0; index--) {
      System.out.print(binaryArray[index] + " ");
    }
  }
}

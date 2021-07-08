package com.zinato.algorithm_100.mode;

import java.util.Scanner;


public class mode {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int[] inputNum = new int[10];
    for (int i = 0; i < 10; i++) {
      inputNum[i] = scan.nextInt();
    }

    //사용자 input
    //1 2 2 3 1 4 2 2 4 3
    //1: 2
    //2: 4 -> 최빈수 (mode)
    //3: 2
    //4: 2

    int[] mode = new int[10];
    for (int i = 0; i < 10; i++) {
       mode[inputNum[i]]++; 
    }

    int modeCount = 0; //최빈수가 나온 횟수
    int modeNum = 0; // 최빈수

    for (int i = 1; i < 5; i++) {  
      if (mode[i] > modeNum) {
        modeNum = mode[i];
        modeCount = i;
      }      
    }
    System.out.println("최빈수는 " + modeCount);
  }
}

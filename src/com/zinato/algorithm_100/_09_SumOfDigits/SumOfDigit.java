package com.zinato.algorithm_100._09_SumOfDigits;

import org.w3c.dom.ls.LSOutput;

public class SumOfDigit {

  public static void main(String[] args) {
    int inputNum  = 1302;
    int sum = 0;

    //자릿수 하나씩 뽑아내기
    //10의 자릿수로 나누고 몫을 남기고 나머지들을 더하기
    // 1232 -> 123  -> 12  -> 1 =>0
    //    2  ->  3  ->  2  -> 1 = 8
    while (inputNum > 0) {
      sum += inputNum % 10;
      inputNum /= 10;
    }
    System.out.println("각 자리의 합은 : " + sum);
  }


}

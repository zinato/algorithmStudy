package com.zinato.algorithm_100._07_PrimeNumber;

public class Main {

  public static void main(String[] args) {

    int num = 18;
    boolean isPrimeNumber = true;

    //소수 1, 자기 자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가 아님.
    //소수 => 1과 자기 자신만 나누어 떨어지면 소수
    isPrimeNumber = calculatePrimeNumberWithSqrt(num);

    System.out.println( num + "는 소수가" + (isPrimeNumber ? " 맞습니다.": " 아닙니다."));

//    System.out.println("num : " + num % num);
  }

  //가장 느린 방법
  private static boolean calculatePrimeNumber(int num) {

    if (num <= 2) {
      return true;
    }

    for (int i = 2; i <= num/2; i++) {
      if (num % i == 0 ) {
        return false;
      }
    }
    return true;
  }

  //제곱근으로 구하는 방법
  private static boolean calculatePrimeNumberWithSqrt(int num) {

    if (num <= 2) {
      return true;
    }

    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0 ) {
        return false;
      }
    }
    return true;
  }

  //에라토스테네스의 체
  //k=2부터 루트 N 이하 까지 반복하여 자연수들 중 K를 제외한 k의 배수들을 제외시킨다.

}


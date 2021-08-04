package com.zinato.algorithm_100._06_GCD;

import java.util.Scanner;

public class Main {
  /*
  최대 공약수 구하기
  입력된 두 수의 최대 공약수를 구하시오.
  12 18
  정답 : 6
   */

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int a;
    int b;

    System.out.print("첫 번째 숫자를 입력하세요 : ");
    a = scanner.nextInt();
    System.out.print("두 번째 숫자를 입력하세요 : ");
    b = scanner.nextInt();
    System.out.println("a : " +  a +", b : " + b);

//    int big;
//    int small;
//    if ( a > b) {
//      big = a;
//      small = b;
//    } else {
//      big = b;
//      small = a;
//    }
//
//    int gcd = 1; //최대 공약수 1로 초기화
//
//    for (int i = 1; i <= small; i++) {
//      if ((big % i == 0) && (small % i == 0)) {
//        gcd = i;
//      }
//    }
//
//    System.out.println("최대 공약수는  : " + gcd);

    System.out.println("최대 공약수 는 :" + GCD(a, b) ) ;


  }

  // 호제법
  // 두수를 나눈다. 두수는 나눈 나머지를 이전 나머지로 다시 나눈후 0이 나올때까지 반본한다. 0이 나왔을 때 직전 나머지가
  // 최대공약수다.
  private static int GCD(int a, int b){
    if (b == 0) {
      return a;
    }
    return GCD(b, a % b);
  }


}

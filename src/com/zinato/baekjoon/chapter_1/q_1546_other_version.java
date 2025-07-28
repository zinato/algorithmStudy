package com.zinato.baekjoon.chapter_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q_1546_other_version {
  /*
  N : 사용자로부터 입력, 과목의 개수
  M : 최대값 기록
  새로운 평균을 구하는 식 (A+B+C)*100/M/N

  @@@@@@@@
  1. 과목의 개수를 입력 받음 -> N에 저장
  2. max, sum 초기화
  3. for (N 만큼)
    과목 점수 입력받은 값 -> temp에 저장
    if max 구함 , sum 구함
  4. print (새로운 평균식)
   */

  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.valueOf(br.readLine());

    long max = 0;
    long sum = 0;

    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < count; i++) {
      int temp = Integer.valueOf(st.nextToken());
      if (temp > max) {
        max = temp;
      }
      sum += temp;
    }
    System.out.println(sum * 100.0 / max / count);
  }
}

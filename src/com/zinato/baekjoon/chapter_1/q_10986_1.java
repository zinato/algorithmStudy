package com.zinato.baekjoon.chapter_1;

import java.io.*;
import java.util.*;

public class q_10986_1 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.valueOf(st.nextToken());
    int M = Integer.valueOf(st.nextToken());

    //합배열 S 초기화
    long S[] = new long[N];
    //각 나머지 값의 카운트를 저장할 배열 C 초기화
    long C[] = new long[M];
    long answer = 0;

    st = new StringTokenizer(br.readLine());
    //합 배열 구하기
    S[0] = Integer.valueOf(st.nextToken());
    for (int i = 1; i < N; i++) {
      S[i] = S[i - 1] + Integer.valueOf(st.nextToken());
    }

    /*
     1. 카운트 값이 0 이면 answer 값에 1씩 카운트 올려줌
     2. 합배열의 나머지의 카운트를 인덱스 C에저장
    */
    for (int i=0; i < N; i++) {
      int remainder = (int) (S[i] % M);
      if (remainder == 0) answer++;
      C[remainder]++;
    }

    /*
      C 배열에 저장된 값 중 0보다 큰 값들은 경우의 수(콤비네이션을)를 통해
      answer 값에 추가 계산
     */

    for (int i = 0; i < M; i++) {
      if (C[i] > 1) {
        answer += C[i] * (C[i] -1) / 2;
      }
    }

    //정답 출력
    System.out.println(answer);



  }

}

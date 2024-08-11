package com.zinato.baekjoon.chapter_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class q_11660 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.valueOf(st.nextToken());
    int M = Integer.valueOf(st.nextToken());

    int A[][] = new int[N+1][N+1];
    int S[][] = new int[N+1][N+1];

    for (int i = 1; i <= N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 1; j <= N; j++) {
        A[i][j] = Integer.valueOf(st.nextToken());
      }
    }

    //합배열 구하기
    for (int i = 1; i <=N; i++) {
      for (int j = 1; j <= N; j++) {
        S[i][j] = S[i][j-1] + S[i-1][j] -S[i-1][j-1]+ A[i][j];
      }
    }

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int x1 = Integer.valueOf(st.nextToken());
      int y1 = Integer.valueOf(st.nextToken());
      int x2 = Integer.valueOf(st.nextToken());
      int y2 = Integer.valueOf(st.nextToken());
      int result = S[x2][y2] - S[x1-1][y2] - S[x2][y1-1] + S[x1-1][y1-1];
      System.out.println(result);
    }
  }
}


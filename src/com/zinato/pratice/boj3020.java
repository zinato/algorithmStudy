package com.zinato.pratice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj3020 {

  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    //장애물의 총 갯수 (석순 + 종유석)
    int N = Integer.valueOf(st.nextToken());
    //장애물의 높이 (배열의 크기)
    int H = Integer.valueOf(st.nextToken());

    //장애물의 높이별 갯수를 가지고 합배열을 구해서 해결
    //석순과 종유석을 구분 해서 계산 한후 역으로 합하여 해결
    int[] s = new int[H+1]; //인덱스 계산을 편학 하기 위해 +1
    int[] j = new int[H+1];

    //input 값을 입력 받아 해당 장애물의 높이에 해당하는 배열의 인덱스에 ++
    for (int i = 0; i < N/2; i++) {
      s[Integer.valueOf(br.readLine())]++;
      j[Integer.valueOf(br.readLine())]++;
    }

    //합배열 구하기
    for (int i = H; i > 0; i--) {
      s[i-1] = s[i] + s[i-1];
      j[i-1] = j[i] + j[i-1];
    }

    //최소값과 그 갯수 구하기
    int min = N;
    int count = 0;
    for (int i = 1; i <= H; i++) {
      int temp = s[i] + j[H+1-i];
      if (min > temp) {
        min = temp;
        count = 1;
      } else if (min == temp) {
        count++;
      }
    }

    //출력하기
    bw.write(min + " " + count);
    bw.flush();
  }

}

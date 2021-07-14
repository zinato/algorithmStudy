package com.zinato.algorithm_100.CapToLow;

import java.util.Scanner;

public class CapToLow {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("단어를 입력하고 엔터를 치세요 : ");
    String input = scan.nextLine();
    char[] arr = input.toCharArray();
    System.out.println("입력한 단어 : " + input);
    for (int i=0; i<input.length(); i++) {
      if (arr[i] >= 'a' && arr[i]<='z') { //소문자 일 때
        arr[i] = (char)(arr[i] + ('A'-'a'));
      } else if (arr[i] >= 'A' && arr[i]<= 'Z') { //대문자 일때
        arr[i] = (char)(arr[i] -('A'-'a'));
      }
    }
    System.out.print("변환된 단어 : ");
    System.out.println(arr);
  }

}

package com.zinato.alco;

import java.util.Scanner;

public class p_01_05 {

  public static String solution(String str) {
    String answer ="";
    char[] charArray = str.toCharArray();
    int lt = 0;
    int rt = charArray.length - 1;
    while(lt < rt) {
      //알파벳이 아니면 lt++
      if (!Character.isAlphabetic(charArray[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(charArray[rt])) {
        rt--;
      } else {
        char temp = charArray[lt];
        charArray[lt] = charArray[rt];
        charArray[rt] = temp;
        lt++;
        rt--;
      }
    }
    answer = String.valueOf(charArray);
    return answer;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    System.out.println(solution(str));

  }

}

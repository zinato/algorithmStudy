package com.zinato.alco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class p01_03 {

  public static String solution(String str) {
    String answer = "";

    String[] strList = str.split(" ");

    answer = Arrays.stream(strList)
        .max(Comparator.comparing(String::length)).get();
//    int max = 0;
//    for (String s : strList) {
//      if (s.length() > max) {
//        max = s.length();
//        answer = s;
//      }
//    }



    return answer;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    System.out.println(solution(str));
  }

}


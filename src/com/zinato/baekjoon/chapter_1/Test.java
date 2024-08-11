package com.zinato.baekjoon.chapter_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

  public static void main(String[] args) {

    List<Score> scores = Arrays.asList(
        new Score(80, 70),
        new Score(50, 80),
        new Score(10, 90),
        new Score(20, 100)
    );
    scores.stream().sorted((o1, o2) -> {
     if (o1.getEnglish() != o2.getEnglish()) {
       return o2.getEnglish() - o1.getEnglish(); //내림차순
     }
     return o2.getMath() - o1.getMath(); //내림 차순
    }).forEach(System.out::println);

   }

  String a ="";
}

class Score {
  private int math;
  private int english;
  public Score(int math, int english) {
    this.math = math;
    this.english = english;
  }

  public int getMath() {
    return math;
  }

  public int getEnglish() {
    return english;
  }

//  @Override
//  public int compareTo(Score o) {
//    if (this.english != o.english) {
//      return o.english - this.english;
//    }
//    return o.math - this.math;
//  }

  @Override
  public String toString() {
    return "Score{" +
        "english=" + english +
        ", math=" + math +
        '}';
  }
}

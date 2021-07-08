package com.zinato.algorithm_100.pivonachi;

public class pivonachi_2 {

  public static void main(String[] args) {
    //An = An -1 + An - 2, n>=3
    int prevPrevNum = 1;
    int prevNum = 1;
    System.out.print(prevPrevNum + " ");
    System.out.print(prevNum + " ");

    for (int i = 1; i < 11; i ++) {
      int nNum = prevPrevNum + prevNum;
      System.out.print(nNum + " ");
      prevPrevNum = prevNum;
      prevNum = nNum;
    }



  }

}

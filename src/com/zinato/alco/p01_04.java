package com.zinato.alco;
import java.util.*;

public class p01_04 {

  public static List<String> solution(String[] strList) {
    List<String> answer = new ArrayList<>();
//    for (String x : strList) {
//      String tmp = new StringBuilder(x).reverse().toString();
//      answer.add(tmp);
//    }
    for (String x : strList) {
      char[] s = x.toCharArray();

      int lt = 0;
      int rt = x.length()-1;
      while(lt < rt) {
        char temp = s[lt];
        s[lt] = s[rt];
        s[rt] = temp;
        lt++;
        rt--;
      }
      answer.add(String.valueOf(s));
    }

    return answer;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int length = scan.nextInt();
    String[] strList = new String[length];
    System.out.println(strList.length);
    for (int i = 0; i < length; i++) {
      strList[i] = scan.next();
    }

    solution(strList).stream()
        .forEach(System.out::println);


  }

}

package com.zinato.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DFSGrapTest2 {

  static HashMap<Integer, List<Integer>> graph = new HashMap<>();
  static List<Integer> visited = new ArrayList<>();

  static void DFS(int firstValue) {
    visited.add(firstValue);
    System.out.print(firstValue + " ");
    for (int v : graph.get(firstValue)) {
      if (!visited.contains(v)) {
        DFS(v);
      }
    }
  }


  public static void main(String[] args) {
    graph.put(1, Arrays.asList(2,3,4,9));
    graph.put(2, Arrays.asList(1,7,8));
    graph.put(3, Arrays.asList(1,5,6,4));
    graph.put(4, Arrays.asList(1,10));
    graph.put(5, Arrays.asList(3));
    graph.put(6, Arrays.asList(3));
    graph.put(7, Arrays.asList(2));
    graph.put(8, Arrays.asList(2));
    graph.put(9, Arrays.asList(1));
    graph.put(10, Arrays.asList(4));

    DFS(1);
  }

}

package com.zinato.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DFSGraph {

  static ArrayList<Integer> visited = new ArrayList<>();
  static HashMap<Integer, List<Integer>> graph = new HashMap<>();

  public static void DFS(int currentValue) {
    System.out.print(currentValue);
    visited.add(currentValue);
    for (int v : graph.get(currentValue)) {
      if (!visited.contains(v)) {
        DFS(v);
      }
    }
  }


  public static void main(String[] args) {
    graph.put(1, Arrays.asList(2,3,4));
    graph.put(2, Arrays.asList(3,5,6));
    graph.put(3, Arrays.asList(4,6,7));
    graph.put(4, Arrays.asList(1,3));
    graph.put(5, Arrays.asList(2));
    graph.put(6, Arrays.asList(2,3));
    graph.put(7, Arrays.asList(3));

    System.out.print("방문 순서 : ");
    DFS(1);

  }

}

package com.zinato.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGrapTest1 {

  static HashMap<Integer, List<Integer>> graph = new HashMap<>();
  static List<Integer> visited = new ArrayList<>();

  static void BFS(int firstValue) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(firstValue);
    visited.add(firstValue);

    while(!queue.isEmpty()) {
      int currentValue = queue.poll();
      System.out.print(currentValue + " ");
      for (int v : graph.get(currentValue)) {
        if (!visited.contains(v)) {
          queue.add(v);
          visited.add(v);
        }
      }
    }
  }
  public static void main(String[] args) {
    graph.put(1, Arrays.asList(2,3,4,9));
    graph.put(2, Arrays.asList(1,7,8));
    graph.put(3, Arrays.asList(1,4,5,6));
    graph.put(4, Arrays.asList(1,10));
    graph.put(5, Arrays.asList(3));
    graph.put(6, Arrays.asList(3));
    graph.put(7, Arrays.asList(2));
    graph.put(8, Arrays.asList(2));
    graph.put(9, Arrays.asList(1));
    graph.put(10, Arrays.asList(4));

    BFS(1);






  }

}

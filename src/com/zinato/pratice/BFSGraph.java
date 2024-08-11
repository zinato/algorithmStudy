package com.zinato.pratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {
  static HashMap<Integer, List<Integer>> graph = new HashMap<>();
  static ArrayList<Integer> visited = new ArrayList<>();

  static void BFS(int startValue) {
    visited.add(startValue);
    Queue<Integer> queue = new LinkedList<>();
    queue.add(startValue);
    while(!queue.isEmpty()) {
      int currentValue = queue.poll();
      System.out.print(currentValue);
      for (int v : graph.get(currentValue)) {
        if (!visited.contains(v)) {
          visited.add(v);
          queue.add(v);
        }
      }

    }

  }

  public static void main(String[] args) {
    BFSGraph.graph.put(1, Arrays.asList(2,3,4));
    BFSGraph.graph.put(2, Arrays.asList(1,3,5,6));
    BFSGraph.graph.put(3, Arrays.asList(4,6,7));
    BFSGraph.graph.put(4, Arrays.asList(1,3));
    BFSGraph.graph.put(5, Arrays.asList(2));
    BFSGraph.graph.put(6, Arrays.asList(2,3));
    BFSGraph.graph.put(7, Arrays.asList(3));

    System.out.print("BFS 탐색 :");
    BFSGraph.BFS(1);
  }
}

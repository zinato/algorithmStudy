package com.zinato.leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

  public static int solution(int[][] times, int n, int k) {

    // k: startIndex, n : time.length

    //1. 그래프 구현 (시간 복잡도 : O(time.length))
    List<List<Pair>> graph = new ArrayList<>(n+1);
    for (int i = 0; i < n+1; i++) {
      graph.add(new ArrayList<>());
    }
    for (int[] time : times) {
      int u = time[0];
      int v = time[1];
      int w = time[2];
      graph.get(u).add(new Pair(w,v));
    }

    //2. 다익스트라 알고리즘 O(ElogE) , E = times.length, 1<= times.length <= 6000, 대락 10^5
    int[] distance = new int[n+1];
    Arrays.fill(distance, Integer.MAX_VALUE);
    distance[k] = 0;

    PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.cost));
    pq.offer(new Pair(0, k));

    while(!pq.isEmpty()) {
      Pair<Integer, Integer> curPair = pq.poll();
      int u = curPair.getNextNode(); //nextNode
      for (Pair<Integer, Integer> p : graph.get(u)) {
        int w = p.getCost(); //cost
        int v = p.getNextNode(); //nextNode
        if (distance[u] + w < distance[v]) {
          pq.offer(new Pair(distance[u] + w, v));
          distance[v] = distance[u] + w;
        }
      }
    }

    //3. 방문 못한 노드 찾기 O(n)
    int answer = 0;
    for (int i =1; i < n+1; i++) {
      if (distance[i] == Integer.MAX_VALUE) {
        return -1;
      }
      answer = Math.max(answer, distance[i]);
    }
    //4. 최소값중에서 최대값 구하기 O(n)
    return answer;
  }

  public static void main(String[] args) {

    int[][] times = {
        {2,1,2},
        {2,3,5},
        {2,4,1},
        {4,3,3}
    };
    System.out.println(NetworkDelayTime.solution(times, 4, 2));
  }

}

class Pair<T, R> {
  T cost;
  R nextNode;

  Pair(T cost, R nextNode) {
    this.cost = cost;
    this.nextNode = nextNode;
  }
  public T getCost() {
    return this.cost;
  }
  public R getNextNode() {
    return this.nextNode;
  }
}

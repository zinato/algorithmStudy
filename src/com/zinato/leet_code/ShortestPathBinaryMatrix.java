package com.zinato.leet_code;

import java.util.LinkedList;
import java.util.Queue;

class Path {
  int x;
  int y;
  int distance;

  public Path(int x, int y, int distance) {
    this.x = x;
    this.y = y;
    this.distance = distance;
  }
}

public class ShortestPathBinaryMatrix {

  public int shortestPathBinaryMatrix(int[][] grid) {
    int shortPathLen = -1;
    int row = grid.length;
    int col = grid[0].length;

    //시작 또는 끝이 1이면 return -1;
    if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1) {
      return shortPathLen;
    }
    boolean[][] visited = new boolean[row][col];
    //상, 하, 좌, 우, 왼쪽위 오른쪽 위, 왼쪽 아래, 오른쪽 아래
    int[][] direction = {
        {-1, 0}, {1, 0}, {0, -1}, {0, 1},
        {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };

    visited[0][0] = true;
    //BFS
    Queue<Path> queue = new LinkedList<>();
    queue.add(new Path(0, 0, 1));
    while (!queue.isEmpty()) {
      Path curPosition = queue.poll();
      int curRow = curPosition.x;
      int curCol = curPosition.y;
      int curDis = curPosition.distance;
      if (curRow == row - 1 && curCol == col - 1) {
        shortPathLen = curDis;
        break;
      }
      for (int k = 0; k < direction.length; k++) {
        int nextRow = curRow + direction[k][0];
        int nextCol = curCol + direction[k][1];
        if (nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col) {
          if (grid[nextRow][nextCol] == 0 && !visited[nextRow][nextCol]) {
            queue.add(new Path(nextRow, nextCol, curDis + 1));
            visited[nextRow][nextCol] = true;
          }
        }
      }
    }

    return shortPathLen;
  }

  public static void main(String[] args) {
    int[][] grid = {
        {0, 0, 0},
        {1, 1, 0},
        {1, 1, 0}
    };
//    int[][] grid = {
//        {0, 0},
//        {1, 0}
//
//    };
    ShortestPathBinaryMatrix shortestPathBinaryMatrix = new ShortestPathBinaryMatrix();
    int c = shortestPathBinaryMatrix.shortestPathBinaryMatrix(grid);
    System.out.println(c);
  }


}

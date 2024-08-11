package com.zinato.pratice;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class NumIslandsPratice {

  public static void main(String[] args) {
    char[][] grid = {
        {'1', '1', '1', '1', '0' },
        {'1', '1', '0', '1', '0' },
        {'1', '1', '0', '0', '0' },
        {'0', '0', '0', '0', '0' }
    };
    NumIslandsPratice numbIslandsPratice = new NumIslandsPratice();

    System.out.println(numbIslandsPratice.numIslands(grid));

  }



  public int numIslands(char[][] grid) {
    int countNumsIslands = 0;
    int row = grid.length;
    int col = grid[0].length;
    //방문기록
    boolean[][] visited = new boolean[row][col];

    //방문할 방향  (상, 하, 좌, 우)
    int[][] direction = {{1,0}, {-1,0},  {0,-1}, {0,1}};

    class Solution {
      private void BFS(int i,int j) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(i,j));
        while(!queue.isEmpty()) {
          Point curPosition = queue.poll();
          int curRow = curPosition.x;
          int curCol = curPosition.y;

          for (int k = 0; k < direction.length; k++) {
            int nextRow = curRow + direction[k][0];
            int nextCol = curCol + direction[k][1];

            if (nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col) {
              if (grid[nextRow][nextCol] == '1' && !visited[nextRow][nextCol]) {
                queue.add(new Point(nextRow, nextCol));
                visited[nextRow][nextCol] = true;
              }
            }
          }

        }
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (grid[i][j] == '1' && ! visited[i][j]) {
          //BFS
          countNumsIslands++;
          visited[i][j] = true;
          new Solution().BFS(i,j);
        }
      }
    }

    return countNumsIslands;
  }
}

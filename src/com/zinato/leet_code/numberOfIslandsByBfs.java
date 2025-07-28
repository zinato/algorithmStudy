package com.zinato.leet_code;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class numberOfIslandsByBfs {


  public static int numIslands(char[][] grid) {
    int islandsCount = 0;
    if (grid.length == 0 || grid[0].length == 0) {
      return islandsCount;
    }
    int row = grid.length;
    int col = grid[0].length;
    boolean[][] visited = new boolean[row][col];

    //상, 하, 좌, 우 방향 좌표
//    int[] dy = new int[]{0, 0, -1, 1};
//    int[] dx = new int[]{-1, 1, 0, 0};
    int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };
    Queue<Point> queue = new LinkedList<>();

    class Solution {
      private void BFS(int i, int j) {
        visited[i][j] = true;
        queue.add(new Point(i, j));

        while (!queue.isEmpty()) {
          Point currentPosition = queue.poll();
          int cur_x = currentPosition.x;
          int cur_y = currentPosition.y;
          for (int k = 0; k < 4; k++) {
//            int next_x = cur_x + dx[k];
//            int next_y = cur_y + dy[k];
            int next_x = cur_x + direction[k][0];
            int next_y = cur_y + direction[k][1];
            if ((next_x >= 0 && next_x < row) && (next_y >= 0 && next_y < col)) {
              if (grid[next_x][next_y] == '1' && !visited[next_x][next_y]) {
                visited[next_x][next_y] = true;
                queue.add(new Point(next_x, next_y));
              }
            }
          }
        }
      }
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
          islandsCount++;
          new Solution().BFS(i,j);

//          int[] dx = new int[]{-1, 1, 0, 0};
//          int[] dy = new int[]{0, 0, -1, 1};
//          Queue<Point> queue = new LinkedList<>();
//          queue.add(new Point(i, j));
//          visited[i][j] = true;
//          while (!queue.isEmpty()) {
//            Point p = queue.poll();
//            int cur_x = p.x;
//            int cur_y = p.y;
//            for (int k = 0; k < 4; k++) {
//              int next_x = cur_x + dx[k];
//              int next_y = cur_y + dy[k];
//              if ((next_x >= 0 && next_x < row) && (next_y >= 0 && next_y < col)) {
//                if (grid[next_x][next_y] == '1' && !visited[next_x][next_y]) {
//                  visited[next_x][next_y] = true;
//                  queue.add(new Point(next_x, next_y));
//                }
//              }
//            }
//          }
        }
      }
    }
    return islandsCount;
  }


  public static void main(String[] args) {
    char[][] grid = {
        {'1', '1', '0', '0', '0' },
        {'1', '1', '0', '0', '0' },
        {'0', '0', '1', '0', '0' },
        {'0', '0', '0', '1', '1' }
    };

    System.out.println(numIslands(grid));

  }
}

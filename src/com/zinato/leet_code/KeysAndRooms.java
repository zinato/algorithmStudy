package com.zinato.leet_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeysAndRooms {



  public boolean canVisitAllRooms(List<List<Integer>> rooms) {

    List<Integer> visited = new ArrayList<>();
    DFS(rooms, visited, 0);

    if (visited.size() == rooms.size()) {
      return true;
    }
    return false;
  }

  public void DFS(List<List<Integer>> rooms, List<Integer> visited, int index) {
    visited.add(index);
    List<Integer> list = rooms.get(index);
    for(int v : list) {
      if (!visited.contains(v)) {
        DFS(rooms, visited, v);
      }
    }
  }


  public static void main(String[] args) {
    KeysAndRooms keysAndRooms = new KeysAndRooms();
    List<List<Integer>> rooms = new ArrayList<>();
    rooms.add(Arrays.asList(1,3));
    rooms.add(Arrays.asList(3,0,1));
    rooms.add(Arrays.asList(2));
    rooms.add(Arrays.asList(0));
//    rooms.add(Arrays.asList(1));
//    rooms.add(Arrays.asList(2));
//    rooms.add(Arrays.asList(0));
    System.out.println(keysAndRooms.canVisitAllRooms(rooms));

//    rooms.forEach(i -> System.out.println(i));




  }

}

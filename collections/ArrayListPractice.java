package collections;

import java.util.*;

public class ArrayListPractice {
  public static void main(String[] args) {
    ArrayList<Integer> grid = new ArrayList<>();

    for(int i = 1; i <= 5; i++) {
      grid.add(10 * i);
    }

    grid.remove(2);
    grid.add(60);

    for(int number : grid){
      System.out.println(number);
    }
  }
}

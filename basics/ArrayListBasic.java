package basics;

import java.util.*;

public class ArrayListBasic {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    
    fruits.set(1, "Grape");

    fruits.remove("Orange");

    for(String fruit : fruits) {
      System.out.println(fruit);
    }
    System.out.println("要素数：" + fruits.size());
  }
}

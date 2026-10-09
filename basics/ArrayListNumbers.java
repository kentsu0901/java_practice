package basics;

import java.util.ArrayList;

public class ArrayListNumbers {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(25);
    numbers.add(30);
    numbers.add(45);
    numbers.add(50);

    int sum = 0;
    ArrayList<Integer> evens = new ArrayList<>();
    for (int number : numbers) {
      sum += number;
      if (number % 2 == 0) {
        evens.add(number);
      }
    }

    System.out.println("合計：" + sum);
    System.out.println("偶数：" + evens);

  }
}

package collections;

import java.util.*;

public class HashMapPractice {
  public static void main(String[] args) {
    HashMap<String, Integer> students = new HashMap<>();

    // 値の代入
    students.put("田中", 80);
    students.put("佐藤", 90);
    students.put("鈴木", 75);

    // 値の更新(更新でも代入と同じ書き方をする)
    students.put("田中", 85);

    // 値の削除
    students.remove("佐藤");

    // 値の出力
    System.out.println(students.get("鈴木"));

  }
}

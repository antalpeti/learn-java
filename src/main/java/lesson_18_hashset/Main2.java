package lesson_18_hashset;

import java.util.HashSet;

public class Main2 {

  public static void main(String[] args) {

    HashSet<String> nevek = new HashSet<>();

    System.out.println(nevek.add("Anna")); // true
    System.out.println(nevek.add("Béla")); // true
    System.out.println(nevek.add("Béla")); // false

    System.out.println(nevek.contains("Anna")); // true
    System.out.println(nevek);

    System.out.println(nevek.contains("Béla")); // true
    nevek.remove("Béla");
    System.out.println(nevek.contains("Béla")); // false

    System.out.println(nevek.size()); // 1
    System.out.println(nevek);
    System.out.println(nevek.isEmpty()); //false
  }
}

package lesson_18_hashset;

import java.util.HashSet;

public class Main1 {

  public static void main(String[] args) {
    HashSet<String> nevek = new HashSet<>();

    nevek.add("Anna");
    nevek.add("Béla");
    nevek.add("Anna");

    System.out.println(nevek.size());
    System.out.println(nevek);
  }
}

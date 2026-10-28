package lesson_29_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {

  public static void main(String[] args) {
    List<Integer> szamok =
        new ArrayList<>(List.of(30, 10, 20));

    Collections.sort(szamok);

    System.out.println(szamok);
  }
}

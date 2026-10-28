package lesson_29_comparable_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main4 {

  public static void main(String[] args) {
    List<Integer> szamok =
        new ArrayList<>(List.of(5, 2, 8, 1));

    szamok.sort(
        Comparator.reverseOrder()
    );

    System.out.println(szamok.get(1));
  }
}

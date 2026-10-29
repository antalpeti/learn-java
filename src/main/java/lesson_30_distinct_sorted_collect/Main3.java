package lesson_30_distinct_sorted_collect;

import java.util.Comparator;
import java.util.List;

public class Main3 {

  public static void main(String[] args) {

    List<Integer> szamok = List.of(5, 2, 8, 1);

    List<Integer> rendezett = szamok.stream()
        .sorted(Comparator.reverseOrder())
        .toList();

    System.out.println(rendezett); // [8, 5, 2, 1]

  }
}

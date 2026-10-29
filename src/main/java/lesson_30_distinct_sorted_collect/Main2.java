package lesson_30_distinct_sorted_collect;

import java.util.List;

public class Main2 {

  public static void main(String[] args) {

    List<Integer> szamok = List.of(5, 2, 8, 1);

    List<Integer> rendezett = szamok.stream()
        .sorted()
        .toList();

    System.out.println(rendezett);

  }
}

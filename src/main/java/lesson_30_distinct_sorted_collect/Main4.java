package lesson_30_distinct_sorted_collect;

import java.util.List;

public class Main4 {

  public static void main(String[] args) {

    List<Integer> szamok = List.of(5, 2, 5, 8, 2, 1);

    List<Integer> eredmeny = szamok.stream()
        .distinct()
        .sorted()
        .toList();

    System.out.println(eredmeny); // [1, 2, 5, 8]

  }
}

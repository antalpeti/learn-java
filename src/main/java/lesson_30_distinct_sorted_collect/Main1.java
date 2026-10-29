package lesson_30_distinct_sorted_collect;

import java.util.List;

public class Main1 {

  public static void main(String[] args) {
    List<Integer> szamok =
        List.of(3, 1, 3, 2, 1, 4);

    List<Integer> eredmeny = szamok.stream()
        .distinct()
        .toList();

    System.out.println(eredmeny);
  }
}

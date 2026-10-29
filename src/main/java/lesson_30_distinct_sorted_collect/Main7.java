package lesson_30_distinct_sorted_collect;

import java.util.List;

public class Main7 {

  public static void main(String[] args) {
    List<Integer> szamok =
        List.of(4, 2, 4, 6, 2, 8);

    long eredmeny = szamok.stream()
        .distinct()
        .filter(n -> n > 3)
        .count();

    System.out.println(eredmeny);
  }
}

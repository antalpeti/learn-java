package lesson_30_distinct_sorted_collect;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main5 {

  public static void main(String[] args) {

    List<String> nevek =
        List.of("Anna", "Béla", "Anna");

    Set<String> egyedi = nevek.stream()
        .collect(Collectors.toSet());

    System.out.println(egyedi);

  }
}

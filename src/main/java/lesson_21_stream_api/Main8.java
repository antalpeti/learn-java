package lesson_21_stream_api;

import java.util.List;


public class Main8 {

  public static void main(String[] args) {

    List<Integer> szamok = List.of(3, 8, 12, 5);

    List<Integer> eredmeny = szamok.stream()
        .filter(n -> n > 4)
        .map(n -> n + 10)
        .toList();

    System.out.println(eredmeny);
  }
}

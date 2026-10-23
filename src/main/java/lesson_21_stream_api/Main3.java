package lesson_21_stream_api;

import java.util.List;

public class Main3 {

  public static void main(String[] args) {

    List<Integer> szamok = List.of(5, 12, 8, 20, 3);

    List<Integer> eredmeny = szamok.stream()
        .filter(szam -> szam > 7)
        .map(szam -> szam * 3)
        .toList();

    System.out.println(eredmeny); // [36, 24, 60]
  }
}

package lesson_21_stream_api;

import java.util.List;

public class Main1 {

  public static void main(String[] args) {
    List<Integer> szamok = List.of(5, 12, 8, 20, 3);

    List<Integer> eredmeny = szamok.stream()
        .filter(szam -> szam > 10)
        .toList();

    System.out.println(eredmeny);
  }
}

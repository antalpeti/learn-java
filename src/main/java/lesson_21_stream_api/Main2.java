package lesson_21_stream_api;

import java.util.List;

public class Main2 {

  public static void main(String[] args) {

    List<Integer> szamok = List.of(2, 4, 6);

    List<Integer> eredmeny = szamok.stream()
        .map(szam -> szam * 2)
        .toList();

    System.out.println(eredmeny);
  }
}

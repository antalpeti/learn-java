package lesson_21_stream_api;

import java.util.List;

public class Main4 {

  public static void main(String[] args) {

    List<Integer> szamok = List.of(10, 20, 30);

    int osszeg = szamok.stream()
        .mapToInt(szam -> szam)
        .sum();

    System.out.println(osszeg); // 60

  }
}

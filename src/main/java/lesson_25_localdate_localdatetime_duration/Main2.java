package lesson_25_localdate_localdatetime_duration;

import java.time.LocalDateTime;

public class Main2 {

  public static void main(String[] args) {

    LocalDateTime indulas = LocalDateTime.of(2026, 10, 24, 10, 30);

    LocalDateTime erkezes = indulas.plusHours(3);

    System.out.println(indulas);
    System.out.println(erkezes);
  }
}

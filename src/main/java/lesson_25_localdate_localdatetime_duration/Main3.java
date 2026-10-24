package lesson_25_localdate_localdatetime_duration;

import java.time.Duration;
import java.time.LocalDateTime;

public class Main3 {

  public static void main(String[] args) {

    LocalDateTime indulas =
        LocalDateTime.of(2026, 10, 24, 10, 0);

    LocalDateTime erkezes =
        LocalDateTime.of(2026, 10, 24, 12, 30);

    Duration ido = Duration.between(indulas, erkezes);

    System.out.println(ido.toMinutes()); // 150
    System.out.println(ido.abs()); // PT2H30M
    System.out.println(ido.getSeconds()); // 9000
    System.out.println(ido.getUnits()); // [Seconds, Nanos]
  }
}

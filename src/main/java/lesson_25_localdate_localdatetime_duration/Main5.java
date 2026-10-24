package lesson_25_localdate_localdatetime_duration;

import java.time.LocalDate;

public class Main5 {

  public static void main(String[] args) {
    LocalDate datum =
        LocalDate.of(2026, 12, 30);

    datum.plusDays(5);
    System.out.println(datum);

    datum = datum.plusDays(5);
    System.out.println(datum);
  }
}

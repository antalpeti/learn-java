package lesson_25_localdate_localdatetime_duration;

import java.time.LocalDate;

public class Main1 {

  public static void main(String[] args) {
    LocalDate datum = LocalDate.of(2026, 10, 24);

    System.out.println(datum);
    System.out.println(datum.plusDays(5));
    System.out.println(datum.minusMonths(1));
    System.out.println(datum.getYear());
    System.out.println(datum.getMonth());
    System.out.println(datum.getMonthValue());
    System.out.println(datum.getDayOfWeek());
    System.out.println(datum.getDayOfMonth());
  }
}

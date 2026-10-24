package lesson_25_localdate_localdatetime_duration;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main4 {

  public static void main(String[] args) {

    LocalDate kezdet = LocalDate.of(2026, 10, 24);
    LocalDate vege = LocalDate.of(2026, 10, 31);

    long napok = ChronoUnit.DAYS.between(kezdet, vege);
    long orak = ChronoUnit.HOURS.between(kezdet.atStartOfDay(), vege.atStartOfDay());
    long percek = ChronoUnit.MINUTES.between(kezdet.atStartOfDay(), vege.atStartOfDay());

    System.out.println(napok); // 7
    System.out.println(orak); // 168
    System.out.println(percek); // 10080
  }
}

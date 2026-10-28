package lesson_29_comparable_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Termek2(String nev, int ar) {

}

public class Main3 {

  public static void main(String[] args) {
    List<Termek2> termekek = new ArrayList<>(List.of(
        new Termek2("Tej", 500),
        new Termek2("Alma", 300),
        new Termek2("Kenyér", 700)
    ));

    // Ár szerint növekvő
    termekek.sort(
        Comparator.comparingInt(Termek2::ar)
    );

    System.out.println(termekek);

    // Név szerint növekvő
    termekek.sort(
        Comparator.comparing(Termek2::nev)
    );
    System.out.println(termekek);

    // Ár szerint csökkenő
    termekek.sort(
        Comparator.comparingInt(Termek2::ar).reversed()
    );

    System.out.println(termekek);

    // Név szerint csökkenő
    termekek.sort(Comparator.comparing(Termek2::nev).reversed());

    System.out.println(termekek);
  }
}

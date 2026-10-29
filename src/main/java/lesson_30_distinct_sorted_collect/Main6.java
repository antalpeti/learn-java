package lesson_30_distinct_sorted_collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main6 {

  public static void main(String[] args) {

    record Termek(String nev, String kategoria) {

    }

    List<Termek> termekek = List.of(
        new Termek("Alma", "Gyümölcs"),
        new Termek("Körte", "Gyümölcs"),
        new Termek("Tej", "Tejtermék")
    );

    Map<String, List<Termek>> csoportok =
        termekek.stream()
            .collect(Collectors.groupingBy(
                Termek::kategoria
            ));

    csoportok.forEach((kategoria, termekekListaja) -> {
      System.out.println(kategoria);
      termekekListaja.forEach(termek -> System.out.println("  " + termek.nev()));
    });
    
  }

}

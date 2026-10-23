package lesson_21_stream_api;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;


public class Main7 {

  public static void main(String[] args) {
    record Dolgozo(String nev, String reszleg, int fizetes, int kor) {

    }

    List<Dolgozo> lista = List.of(new Dolgozo("Anna", "IT", 900, 30), new Dolgozo("Béla", "IT", 700, 25),
        new Dolgozo("Csilla", "HR", 600, 40), new Dolgozo("Dénes", "HR", 650, 35), new Dolgozo("Éva", "Pénzügy", 800, 28));

    // 1. Egyszerű csoportosítás: Map<String, List<Dolgozo>>
    Map<String, List<Dolgozo>> reszlegek = lista.stream().collect(groupingBy(Dolgozo::reszleg));
    System.out.println(reszlegek);
    System.out.println("---");

    // 2. Darabszám csoportonként: {IT=2, HR=2, Pénzügy=1}
    Map<String, Long> darab = lista.stream().collect(groupingBy(Dolgozo::reszleg, counting()));
    System.out.println(darab);
    System.out.println("---");

    // 3. Összeg csoportonként
    Map<String, Integer> osszeg = lista.stream().collect(groupingBy(Dolgozo::reszleg, summingInt(Dolgozo::fizetes)));
    System.out.println(osszeg);
    System.out.println("---");

    // 4. Átlag csoportonként
    Map<String, Double> atlag = lista.stream().collect(groupingBy(Dolgozo::reszleg, averagingInt(Dolgozo::fizetes)));
    System.out.println(atlag);
    System.out.println("---");

    // 5. Csak a nevek listája: {IT=[Anna, Béla], ...}
    Map<String, List<String>> nevek = lista.stream().collect(groupingBy(Dolgozo::reszleg, mapping(Dolgozo::nev, toList())));
    System.out.println(nevek);
    System.out.println("---");

    // 6. Nevek összefűzve szöveggé
    Map<String, String> nevSzoveg = lista.stream().collect(groupingBy(Dolgozo::reszleg, mapping(Dolgozo::nev, joining(", "))));
    System.out.println(nevSzoveg);
    System.out.println("---");

    // 7. Legnagyobb fizetésű dolgozó csoportonként
    Map<String, Optional<Dolgozo>> legjobb = lista.stream()
        .collect(groupingBy(Dolgozo::reszleg, maxBy(Comparator.comparingInt(Dolgozo::fizetes))));
    System.out.println(legjobb);
    System.out.println("---");

    // 8. Rendezett kulcsú térkép (TreeMap) és halmaz értékekkel
    Map<String, Set<Integer>> rendezett = lista.stream()
        .collect(groupingBy(Dolgozo::reszleg, TreeMap::new, mapping(Dolgozo::kor, toSet())));
    System.out.println(rendezett);
    System.out.println("---");

    // 9. Feltétel szerinti csoportosítás: partitioningBy két csoportot ad (true/false)
    Map<Boolean, List<Dolgozo>> sokat = lista.stream().collect(partitioningBy(d -> d.fizetes() >= 700));
    System.out.println(sokat);
    System.out.println("---");

    // 10. Többszintű csoportosítás: részleg, azon belül korcsoport
    Map<String, Map<String, List<String>>> tobbszintu = lista.stream()
        .collect(groupingBy(Dolgozo::reszleg, groupingBy(d -> d.kor() < 30 ? "fiatal" : "idősebb", mapping(Dolgozo::nev, toList()))));
    System.out.println(tobbszintu);
  }
}

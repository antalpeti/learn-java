package lesson_22_optional;

import java.util.Optional;

public class Main5 {

  public static void main(String[] args) {

    Optional<String> nev = Optional.of("Anna");

    nev.ifPresent(n -> System.out.println(n));

    Optional<Integer> hossz = nev.map(n -> n.length());

    System.out.println(hossz.orElse(0)); // 4

  }
}

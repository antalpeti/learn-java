package lesson_22_optional;

import java.util.Optional;

public class Main6 {

  public static void main(String[] args) {
    Optional<String> nev = Optional.empty();

    int hossz = nev
        .map(n -> n.length())
        .orElse(10);

    System.out.println(hossz);
  }
}

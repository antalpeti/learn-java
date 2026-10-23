package lesson_22_optional;

import java.util.Optional;

public class Main3 {

  public static void main(String[] args) {

    // Biztosan van érték
    Optional<String> a = Optional.of("Anna");

    // Lehet null is
    Optional<String> b = Optional.ofNullable(null);

    // Biztosan üres
    Optional<String> c = Optional.empty();

    Optional<String> d = Optional.of(null);

  }
}

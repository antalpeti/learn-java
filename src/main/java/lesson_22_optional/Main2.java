package lesson_22_optional;

import java.util.Optional;

public class Main2 {

  public static void main(String[] args) {

    Optional<String> nev = Optional.ofNullable(null);

    System.out.println(nev.isPresent()); // false

  }
}

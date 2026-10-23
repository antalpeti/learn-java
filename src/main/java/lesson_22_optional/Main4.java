package lesson_22_optional;

import java.util.Optional;

public class Main4 {

  public static void main(String[] args) {

    Optional<String> nev = Optional.empty();

    String eredmeny = nev.orElse("Ismeretlen");

    System.out.println(eredmeny);

  }
}

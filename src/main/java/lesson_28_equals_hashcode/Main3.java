package lesson_28_equals_hashcode;

import java.util.HashSet;

record Termek(String nev, int ar) {

}

public class Main3 {

  public static void main(String[] args) {
    HashSet<Termek> termekek = new HashSet<>();

    termekek.add(new Termek("Alma", 100));
    termekek.add(new Termek("Alma", 100));
    termekek.add(new Termek("Körte", 200));

    System.out.println(termekek.size());
  }
}

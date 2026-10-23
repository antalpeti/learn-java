package lesson_19_generics;

import java.util.ArrayList;

public class Main4 {

  public static void main(String[] args) {
    ArrayList<String> nevek = new ArrayList<>();

    nevek.add("Anna");
    nevek.add("Béla");
    nevek.add("Kata");

    String nev = nevek.get(1);

    System.out.println(nev);
  }
}

package lesson_17_hashmap;

import java.util.HashMap;

public class Main3 {

  public static void main(String[] args) {

    HashMap<String, Integer> korok = new HashMap<>();

    korok.put("Anna", 25);
    korok.put("Béla", 30);
    korok.put("Tamás", 35);
    korok.put("András", 20);

    for (String nev : korok.keySet()) {
      System.out.println(nev + ": " + korok.get(nev));
    }
  }
}

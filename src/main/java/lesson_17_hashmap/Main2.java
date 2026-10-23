package lesson_17_hashmap;

import java.util.HashMap;

public class Main2 {

  public static void main(String[] args) {

    HashMap<String, Integer> korok = new HashMap<>();

    korok.put("Anna", 25);
    korok.put("Béla", 30);

    System.out.println(korok.get("Anna")); // 25

    korok.put("Anna", 26); // Érték módosítása
    korok.remove("Béla");  // Kulcs törlése

    System.out.println(korok.get("Anna")); // 26
    System.out.println(korok.size()); // 1
    System.out.println(korok.containsKey("Anna")); // true
  }
}

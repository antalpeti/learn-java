package lesson_17_hashmap;

import java.util.HashMap;

public class Main4 {

  public static void main(String[] args) {

    HashMap<String, Integer> arak = new HashMap<>();

    arak.put("Alma", 100);
    arak.put("Körte", 200);

    arak.put("Alma", 150);

    System.out.println(arak.get("Alma"));
    System.out.println(arak.size());
  }
}

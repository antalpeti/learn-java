package lesson_31_getordefault_computeifabsent_merge;

import java.util.HashMap;
import java.util.Map;

public class Main4 {

  public static void main(String[] args) {
    Map<String, Integer> pontok = new HashMap<>();

    pontok.put("Anna", 10);

    pontok.merge("Anna", 5, Integer::sum);
    pontok.merge("Béla", 5, Integer::sum);

    int eredmeny =
        pontok.getOrDefault("Anna", 0)
            + pontok.getOrDefault("Csilla", 3);

    System.out.println(eredmeny);
    System.out.println(pontok.size());
  }
}

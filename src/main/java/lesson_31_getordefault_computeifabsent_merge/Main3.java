package lesson_31_getordefault_computeifabsent_merge;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

  public static void main(String[] args) {

    Map<String, Integer> darab = new HashMap<>();

    darab.merge("Alma", 1, Integer::sum);
    darab.merge("Alma", 1, Integer::sum);
    darab.merge("Körte", 1, Integer::sum);

    System.out.println(darab.get("Alma"));
    System.out.println(darab.get("Körte"));

  }
}

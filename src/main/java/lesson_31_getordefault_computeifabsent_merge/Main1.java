package lesson_31_getordefault_computeifabsent_merge;

import java.util.HashMap;
import java.util.Map;

public class Main1 {

  public static void main(String[] args) {

    Map<String, Integer> keszlet = new HashMap<>();

    String alma = "Alma";
    keszlet.put(alma, 10);
    String korte = "Körte";
    keszlet.put(korte, 5);

    System.out.println(keszlet);

    System.out.println(keszlet.getOrDefault(alma, 0));
    String banan = "Banán";
    System.out.println(keszlet.getOrDefault(banan, 0));

    System.out.println(keszlet);

  }
}

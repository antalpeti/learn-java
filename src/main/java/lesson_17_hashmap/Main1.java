package lesson_17_hashmap;

import java.util.HashMap;

public class Main1 {

  public static void main(String[] args) {
    HashMap<String, String> telefonkonyv =
        new HashMap<>();

    telefonkonyv.put("Anna", "123456");
    telefonkonyv.put("Béla", "234567");
    telefonkonyv.put("Csilla", "345678");

    System.out.println(telefonkonyv.get("Anna"));
    System.out.println(telefonkonyv.get("Béla"));
    System.out.println(telefonkonyv.get("Csilla"));
  }
}

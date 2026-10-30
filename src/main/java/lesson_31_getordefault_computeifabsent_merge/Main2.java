package lesson_31_getordefault_computeifabsent_merge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {

  public static void main(String[] args) {

    Map<String, List<String>> lakosok = new HashMap<>();

    lakosok.computeIfAbsent(
        "Budapest",
        varos -> new ArrayList<>()
    ).add("Anna");

    lakosok.computeIfAbsent(
        "Budapest",
        varos -> new ArrayList<>()
    ).add("Béla");

    System.out.println(lakosok.get("Budapest"));

  }
}

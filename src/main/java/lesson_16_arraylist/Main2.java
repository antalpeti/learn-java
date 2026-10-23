package lesson_16_arraylist;

import java.util.ArrayList;

public class Main2 {

  public static void main(String[] args) {

    ArrayList<String> lista = new ArrayList<>();

    lista.add("Alma");
    lista.add("Tej");
    lista.add("Kenyér");

    lista.get(0);          // "Alma"
    lista.set(1, "Víz");   // Tej helyett Víz
    lista.remove(0);       // Alma törlése
    System.out.println(lista.size()); // 2
    System.out.println(lista);
  }
}

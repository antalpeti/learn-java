package lesson_16_arraylist;

import java.util.ArrayList;

public class Main3 {

  public static void main(String[] args) {

    ArrayList<String> nevek = new ArrayList<>();

    nevek.add("Anna");
    nevek.add("Béla");
    nevek.add("Csilla");
    nevek.remove(2);
    nevek.add("Dávid");
    nevek.set(2, "Timea");

    for (String nev : nevek) {
      System.out.println("Szia, " + nev + "!");
    }
  }
}

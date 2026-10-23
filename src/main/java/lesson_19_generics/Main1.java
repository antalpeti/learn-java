package lesson_19_generics;

import java.util.ArrayList;

public class Main1 {

  public static void main(String[] args) {

    ArrayList<Integer> szamok = new ArrayList<>();

    szamok.add(10);
    szamok.add(20);

    // Ez fordítási hibát okozna:
    //    szamok.add("Alma");

  }

}

package lesson_16_arraylist;

import java.util.ArrayList;

public class Main4 {

  public static void main(String[] args) {
    ArrayList<Integer> szamok =
        new ArrayList<>();

    szamok.add(10);
    szamok.add(20);
    szamok.add(30);

    szamok.remove(1);
    szamok.add(40);

    System.out.println(szamok.get(1));
  }
}

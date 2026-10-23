package lesson_18_hashset;

import java.util.HashSet;

public class Main3 {

  public static void main(String[] args) {

    HashSet<Integer> szamok = new HashSet<>();

    szamok.add(10);
    szamok.add(20);
    szamok.add(30);

    for (int szam : szamok) {
      System.out.println(szam);
    }
  }
}

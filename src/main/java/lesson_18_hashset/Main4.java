package lesson_18_hashset;

import java.util.HashSet;

public class Main4 {

  public static void main(String[] args) {
    HashSet<Integer> szamok = new HashSet<>();

    szamok.add(10);
    szamok.add(20);
    szamok.add(10);
    szamok.add(30);

    szamok.remove(20);

    System.out.println(szamok.size());
    System.out.println(szamok.contains(10));
    System.out.println(szamok.contains(20));
    System.out.println(szamok.contains(30));
    System.out.println(szamok);
  }
}


package lesson_06_array;

public class Main4 {

  public static void main(String[] args) {

    int[] szamok = {5, 10, 15, 20};

    int osszeg = 0;

    for (int i = 1; i < 3; i++) {
      osszeg = osszeg + szamok[i];
    }

    System.out.println(osszeg);

  }

}

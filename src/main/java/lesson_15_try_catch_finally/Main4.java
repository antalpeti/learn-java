package lesson_15_try_catch_finally;

public class Main4 {

  public static void main(String[] args) {

    try {
      int[] szamok = {10, 20, 30};

      System.out.println(szamok[5]);
      System.out.println("Siker");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Hibás index");
    } finally {
      System.out.println("Vége");
    }
  }

}

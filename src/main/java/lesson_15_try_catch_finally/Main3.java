package lesson_15_try_catch_finally;

public class Main3 {

  public static void main(String[] args) {

    try {
      System.out.println("Művelet indul.");
      int x = 10 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Hiba történt!");
    } finally {
      System.out.println("Művelet lezárva.");
    }

  }
}

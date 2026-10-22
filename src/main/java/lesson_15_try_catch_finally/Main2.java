package lesson_15_try_catch_finally;

public class Main2 {

  public static void main(String[] args) {

    try {
      int eredmeny = 10 / 0;
      System.out.println(eredmeny);
    } catch (ArithmeticException e) {
      System.out.println("Nullával nem oszthatunk!");
    }

    System.out.println("A program folytatódik.");

  }
}

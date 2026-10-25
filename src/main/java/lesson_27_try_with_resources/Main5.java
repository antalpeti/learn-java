package lesson_27_try_with_resources;

class Teszt implements AutoCloseable {

  @Override
  public void close() {
    System.out.println("Lezárás");
  }
}

public class Main5 {

  public static void main(String[] args) {

    try (Teszt t = new Teszt()) {
      System.out.println("Munka");
      throw new RuntimeException("Hiba");
    } catch (RuntimeException e) {
      System.out.println("Elkapva");
    }
  }
}

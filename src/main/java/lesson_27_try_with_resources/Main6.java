package lesson_27_try_with_resources;

public class Main6 {

  private static class Teszt implements AutoCloseable {

    @Override
    public void close() {
      System.out.println("Lezárás");
    }
  }

  public static void main(String[] args) {

    try (Teszt t = new Teszt()) {
      System.out.println("Munka");
      throw new RuntimeException("Hiba");
    } catch (RuntimeException e) {
      System.out.println("Elkapva");
    }
  }
}

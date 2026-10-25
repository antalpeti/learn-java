package lesson_27_try_with_resources;

class Kulso {

  void futtat() {
    try (Main7.Teszt t = new Main7.Teszt()) {
      System.out.println("Munka");
      throw new RuntimeException("Hiba");
    } catch (RuntimeException e) {
      System.out.println("Elkapva");
    }
  }
}

public class Main7 {

  // Nem private, így a külső osztályból is elérhető: Main7.Teszt
  public static class Teszt implements AutoCloseable {

    @Override
    public void close() {
      System.out.println("Lezárás");
    }
  }

  public static void main(String[] args) {
    new Kulso().futtat();
  }
}

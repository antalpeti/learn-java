package lesson_27_try_with_resources;

class SajatEroforras implements AutoCloseable {

  @Override
  public void close() {
    System.out.println("Erőforrás lezárva.");
  }
}

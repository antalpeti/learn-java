package lesson_27_try_with_resources;

public class Main4 {

  public static void main(String[] args) {
    try (SajatEroforras r = new SajatEroforras()) {
      System.out.println("Erőforrás használata.");
    }
  }
}

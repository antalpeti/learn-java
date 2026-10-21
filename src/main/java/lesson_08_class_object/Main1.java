package lesson_08_class_object;


public class Main1 {

  public static void main(String[] args) {

    Auto auto1 = new Auto();
    auto1.marka = "Ford";
    auto1.evjarat = 2006;

    Auto auto2 = new Auto();
    auto2.marka = "Toyota";
    auto2.evjarat = 2020;

    auto1.bemutatkozik();
    auto2.bemutatkozik();
  }
}

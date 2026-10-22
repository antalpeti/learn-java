package lesson_11_inheritance;

class Jarmu2 {

  String marka;

  void indul() {
    System.out.println("Jármű indul.");
  }
}

class Auto2 extends Jarmu2 {

  int ajtokSzama;

  @Override
  void indul() {
    System.out.println("Autó indul.");
  }
}

public class Main2 {

  public static void main(String[] args) {
    Auto2 auto2 = new Auto2();

    auto2.marka = "Ford";
    auto2.ajtokSzama = 5;

    auto2.indul();
  }
}

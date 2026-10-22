package lesson_11_inheritance;

class Jarmu1 {

  String marka;

  void indul() {
    System.out.println("A jármű elindult.");
  }
}

class Auto1 extends Jarmu1 {

  int ajtokSzama;
}

public class Main1 {

  public static void main(String[] args) {
    Auto1 auto1 = new Auto1();

    auto1.marka = "Ford";
    auto1.ajtokSzama = 5;

    auto1.indul();
  }
}

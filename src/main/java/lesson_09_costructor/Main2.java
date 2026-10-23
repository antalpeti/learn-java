package lesson_09_costructor;


class Auto2 {

  String marka;
  int evjarat;

  Auto2(String marka, int evjarat) {
    this.marka = marka;
    this.evjarat = evjarat;
  }

  void bemutatkozik() {
    System.out.println(marka + " - " + evjarat);
  }
}

public class Main2 {

  public static void main(String[] args) {
    Auto2 auto2 = new Auto2("Ford", 2006);
    auto2.bemutatkozik();
  }
}

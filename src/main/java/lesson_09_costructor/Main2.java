package lesson_09_costructor;


class Auto1 {

  String marka;
  int evjarat;

  Auto1(String marka, int evjarat) {
    this.marka = marka;
    this.evjarat = evjarat;
  }

  void bemutatkozik() {
    System.out.println(marka + " - " + evjarat);
  }
}

public class Main2 {

  public static void main(String[] args) {
    Auto1 auto = new Auto1("Ford", 2006);
    auto.bemutatkozik();
  }
}

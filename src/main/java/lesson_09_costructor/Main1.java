package lesson_09_costructor;


class Auto {

  String marka;
  int evjarat;

  Auto(String m, int e) {
    marka = m;
    evjarat = e;
  }

  void bemutatkozik() {
    System.out.println(marka + " - " + evjarat);
  }
}

public class Main1 {

  public static void main(String[] args) {
    Auto auto = new Auto("Ford", 2006);
    auto.bemutatkozik();
  }
}

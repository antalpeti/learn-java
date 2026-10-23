package lesson_09_costructor;


class Auto1 {

  String marka;
  int evjarat;

  Auto1(String m, int e) {
    marka = m;
    evjarat = e;
  }

  void bemutatkozik() {
    System.out.println(marka + " - " + evjarat);
  }
}

public class Main1 {

  public static void main(String[] args) {
    Auto1 auto1 = new Auto1("Ford", 2006);
    auto1.bemutatkozik();
  }
}

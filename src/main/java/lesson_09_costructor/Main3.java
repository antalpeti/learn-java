package lesson_09_costructor;


class Teglalap {

  int szelesseg;
  int magassag;

  Teglalap(int szelesseg, int magassag) {
    this.szelesseg = szelesseg;
    this.magassag = magassag;
  }

  int terulet() {
    return szelesseg * magassag;
  }
}

public class Main3 {

  public static void main(String[] args) {
    Teglalap t = new Teglalap(4, 5);

    System.out.println(t.terulet());
  }
}

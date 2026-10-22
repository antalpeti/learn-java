package lesson_11_inheritance;

class Allat {

  void hangotAd() {
    System.out.println("Állathang");
  }
}

class Kutya extends Allat {

  @Override
  void hangotAd() {
    System.out.println("Vau!");
  }
}

public class Main3 {

  public static void main(String[] args) {
    Allat allat = new Allat();
    Kutya kutya = new Kutya();

    allat.hangotAd();
    kutya.hangotAd();
  }
}

package lesson_19_generics;


public class Main3 {

  static <T> void kiir(T ertek) {
    System.out.println(ertek);
  }

  static void kiirSzam(Integer szam) {
    System.out.println(szam);
  }

  static void kiirSzoveg(String szoveg) {
    System.out.println(szoveg);
  }

  public static void main(String[] args) {
    kiir("Szia!");
    kiir(100);
    kiir(true);
    kiirSzam(42);
//    kiirSzam("42"); // HIBA
    kiirSzoveg("42");
//    kiirSzoveg(42); // HIBA

  }
}


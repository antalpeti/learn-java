package lesson_29_comparable_comparator;

class Termek1 implements Comparable<Termek1> {

  String nev;
  int ar;

  Termek1(String nev, int ar) {
    this.nev = nev;
    this.ar = ar;
  }

  @Override
  public int compareTo(Termek1 masik) {
    return Integer.compare(this.ar, masik.ar);
  }
}

package lesson_24_enum;

enum Nap {
  HETFO("Hétfő"),
  KEDD("Kedd"),
  SZERDA("Szerda");

  private final String nev;

  Nap(String nev) {
    this.nev = nev;
  }

  public String getNev() {
    return nev;
  }
}

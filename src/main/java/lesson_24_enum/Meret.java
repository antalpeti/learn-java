package lesson_24_enum;

enum Meret {
  KICSI(1),
  KOZEPES(2),
  NAGY(3);

  private final int kod;

  Meret(int kod) {
    this.kod = kod;
  }

  public int getKod() {
    return kod;
  }
}

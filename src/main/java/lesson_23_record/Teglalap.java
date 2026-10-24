package lesson_23_record;

record Teglalap(int szelesseg, int magassag) {

  int terulet() {
    return szelesseg * magassag;
  }
}

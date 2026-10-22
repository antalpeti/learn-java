package lesson_13_interface;

public class Main2 {

  public static void main(String[] args) {
    ElektromosAuto2 elektromosAuto2 = new ElektromosAuto2();
    Toltheto[] eszkozok = {
        elektromosAuto2,
        new Roller()
    };

    for (Toltheto eszkoz : eszkozok) {
      eszkoz.toltes();
    }
    elektromosAuto2.mozog();
  }
}

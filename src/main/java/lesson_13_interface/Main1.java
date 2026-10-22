package lesson_13_interface;

public class Main1 {

  public static void main(String[] args) {
    Toltheto[] eszkozok = {
        new ElektromosAuto1(),
        new Roller()
    };

    for (Toltheto eszkoz : eszkozok) {
      eszkoz.toltes();
    }
  }
}

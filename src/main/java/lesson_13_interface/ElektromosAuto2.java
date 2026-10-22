package lesson_13_interface;

import lesson_12_polymorphism.Jarmu;

class ElektromosAuto2 extends Jarmu
    implements Toltheto {

  @Override
  public void toltes() {
    System.out.println("Töltés indul.");
  }
}

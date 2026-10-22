package lesson_12_polymorphism;

class Auto extends Jarmu {

  @Override
  public void mozog() {
    System.out.println("Autó gurul");
  }
}

public class Main3 {

  public static void main(String[] args) {
    Jarmu j = new Auto();
    j.mozog();
  }

}

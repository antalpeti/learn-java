package lesson_12_polymorphism;

public class Main1 {

  public static void main(String[] args) {

    Allat allat1 = new Kutya();
    Allat allat2 = new Macska();

    allat1.hangotAd(); // Vau!
    allat2.hangotAd(); // Miau!

  }
}

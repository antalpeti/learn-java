package lesson_12_polymorphism;

public class Main2 {

  public static void main(String[] args) {
    Allat[] allatok = {new Kutya(), new Macska(), new Kutya()};

    for (Allat allat : allatok) {
      allat.hangotAd();
    }
  }
  
}

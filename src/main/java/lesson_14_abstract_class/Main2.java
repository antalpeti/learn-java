package lesson_14_abstract_class;

public class Main2 {

  public static void main(String[] args) {
    Allat kutya = new Kutya();

    kutya.eszik();
    kutya.hangotAd();

    Allat macska = new Macska();
    macska.eszik();
    macska.hangotAd();
  }
}

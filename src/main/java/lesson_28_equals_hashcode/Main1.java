package lesson_28_equals_hashcode;

class Auto1 {

  String marka;

  Auto1(String marka) {
    this.marka = marka;
  }
}

public class Main1 {

  public static void main(String[] args) {
    Auto1 a = new Auto1("Ford");
    Auto1 b = new Auto1("Ford");

    System.out.println(a == b);
    System.out.println(a.equals(b));
  }
}

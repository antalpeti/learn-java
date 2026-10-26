package lesson_28_equals_hashcode;

import java.util.Objects;

class Auto2 {

  String marka;

  Auto2(String marka) {
    this.marka = marka;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (!(obj instanceof Auto2 masik)) {
      return false;
    }

    return Objects.equals(marka, masik.marka);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marka);
  }
}

public class Main2 {

  public static void main(String[] args) {
    Auto2 a = new Auto2("Ford");
    Auto2 b = new Auto2("Ford");

    System.out.println(a == b);
    System.out.println(a.equals(b));
  }
}

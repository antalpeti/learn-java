package lesson_07_method;


public class Main4 {

  static int duplaz(int szam) {
    return szam * 2;
  }

  public static void main(String[] args) {
    int eredmeny = duplaz(4) + duplaz(3);

    System.out.println(eredmeny);
  }
}


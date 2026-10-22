package lesson_13_interface;

interface Hangszer {

  void jatszik();
}

class Gitar implements Hangszer {

  public void jatszik() {
    System.out.println("Pengetés");
  }
}

class Dob implements Hangszer {

  public void jatszik() {
    System.out.println("Ütés");
  }
}

public class Main3 {

  public static void main(String[] args) {
    Hangszer h = new Dob();
    h.jatszik();
    Hangszer g = new Gitar();
    g.jatszik();
  }
}

package lesson_10_private_getter_setter;

class Termek {

  private int ar = 100;

  public int getAr() {
    return ar;
  }

  public void setAr(int ujAr) {
    if (ujAr > 0) {
      ar = ujAr;
    }
  }
}

public class Main5 {

  public static void main(String[] args) {
    Termek termek = new Termek();

    termek.setAr(-50);
    System.out.println(termek.getAr());
    
    termek.setAr(200);

    System.out.println(termek.getAr());
  }
}

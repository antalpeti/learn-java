package lesson_10_private_getter_setter;

public class Main1 {

  public static void main(String[] args) {
    Bankszamla1 szamla = new Bankszamla1();

    szamla.egyenleg = -1000000;
    System.out.println(szamla.egyenleg);
  }
}

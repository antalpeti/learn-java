package lesson_10_private_getter_setter;

public class Main4 {

  public static void main(String[] args) {

    Bankszamla4 szamla = new Bankszamla4();

    System.out.println(szamla.getEgyenleg());
    szamla.setEgyenleg(2000);
    System.out.println(szamla.getEgyenleg());

  }

}

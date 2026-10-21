package lesson_10_private_getter_setter;

public class Main3 {

  public static void main(String[] args) {

    Bankszamla3 szamla = new Bankszamla3();

    System.out.println(szamla.getEgyenleg());
    int ujEgyenleg = szamla.getEgyenleg();
    ujEgyenleg += 1000;
    System.out.println(ujEgyenleg);
    System.out.println(szamla.getEgyenleg());

  }

}

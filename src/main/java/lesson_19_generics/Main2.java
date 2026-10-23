package lesson_19_generics;

public class Main2 {

  public static void main(String[] args) {

    Doboz<String> szovegDoboz = new Doboz<>();
    szovegDoboz.setTartalom("Alma");

    Doboz<Integer> szamDoboz = new Doboz<>();
    szamDoboz.setTartalom(42);

    System.out.println(szovegDoboz.getTartalom());
    System.out.println(szamDoboz.getTartalom());
  }

}

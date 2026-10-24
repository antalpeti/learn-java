package lesson_23_record;


public class Main2 {

  public static void main(String[] args) {
    Auto auto = new Auto("Ford", 2006);

    System.out.println(auto.marka());
    System.out.println(auto.evjarat());
    System.out.println(auto);

    // auto1.marka = "Toyota"; // HIBA
  }
}

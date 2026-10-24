package lesson_23_record;

public class Main4 {

  public static void main(String[] args) {
    Termek t1 = new Termek("Alma", 100);
    Termek t2 = new Termek("Alma", 100);

    System.out.println(t1.equals(t2));
    System.out.println(t1 == t2);
  }
}

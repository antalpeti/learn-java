package lesson_24_enum;

public class Main5 {

  public static void main(String[] args) {
    Nap nap = Nap.KEDD;

    if (nap == Nap.HETFO) {
      System.out.println("Hétfő");
    } else if (nap == Nap.KEDD) {
      System.out.println("Kedd");
    } else {
      System.out.println("Másik nap");
    }

    nap = Nap.SZERDA;
    switch (nap) {
      case HETFO:
        System.out.println(Nap.HETFO.getNev());
        break;
      case KEDD:
        System.out.println(Nap.KEDD.getNev());
        break;
      default:
        System.out.println("Másik nap");
        break;
    }
  }


}

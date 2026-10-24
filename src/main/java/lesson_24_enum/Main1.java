package lesson_24_enum;

public class Main1 {

  public static void main(String[] args) {

    RendelesAllapot allapot = RendelesAllapot.UJ;

    System.out.println(allapot);

    allapot = RendelesAllapot.TELJESITVE;

    // Fordítási hiba lenne:
    // allapot = RendelesAllapot.TELJESITVEE;

  }

}

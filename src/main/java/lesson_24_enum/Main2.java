package lesson_24_enum;

public class Main2 {

  public static void main(String[] args) {
    RendelesAllapot allapot =
        RendelesAllapot.FELDOLGOZAS_ALATT;

    switch (allapot) {
      case UJ -> System.out.println("Új rendelés");
      case FELDOLGOZAS_ALATT -> System.out.println("Csomagolás alatt");
      case TELJESITVE -> System.out.println("Kiszállítva");
    }
  }

}

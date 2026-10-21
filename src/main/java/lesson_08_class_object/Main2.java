package lesson_08_class_object;


class Kutya {

  String nev;

  void ugat() {
    System.out.println(nev + " ugat!");
  }
}

public class Main2 {

  public static void main(String[] args) {
    Kutya kutya1 = new Kutya();
    kutya1.nev = "Bodri";

    Kutya kutya2 = new Kutya();
    kutya2.nev = "Morzsi";

    kutya1.ugat();
  }
}


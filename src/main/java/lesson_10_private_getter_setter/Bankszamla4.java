package lesson_10_private_getter_setter;


public class Bankszamla4 {

  private int egyenleg = 1000;

  public int getEgyenleg() {
    return egyenleg;
  }

  public void setEgyenleg(int ujEgyenleg) {
    if (ujEgyenleg >= 0) {
      egyenleg = ujEgyenleg;
    }
  }

}


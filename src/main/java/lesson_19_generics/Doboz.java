package lesson_19_generics;

class Doboz<T> {

  private T tartalom;

  public T getTartalom() {
    return tartalom;
  }

  public void setTartalom(T tartalom) {
    this.tartalom = tartalom;
  }
}

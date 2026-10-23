package lesson_20_lambda_expression;

import java.util.function.Function;

public class Main3 {

  public static void main(String[] args) {
    Function<Integer, Integer> duplaz =
        szam -> szam * 2;

    System.out.println(duplaz.apply(5));
  }
}

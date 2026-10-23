package lesson_20_lambda_expression;

import java.util.function.Function;

public class Main4 {

  public static void main(String[] args) {

    Function<Integer, Integer> szamol = szam -> {
      int eredmeny = szam * 2;
      return eredmeny + 1;
    };

    System.out.println(szamol.apply(5)); // 11
  }
}

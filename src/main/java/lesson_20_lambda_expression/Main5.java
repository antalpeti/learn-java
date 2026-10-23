package lesson_20_lambda_expression;

import java.util.List;

public class Main5 {

  public static void main(String[] args) {
    List<Integer> szamok = List.of(2, 4, 6);

    szamok.forEach(
        szam -> System.out.println(szam + 1)
    );
  }
}

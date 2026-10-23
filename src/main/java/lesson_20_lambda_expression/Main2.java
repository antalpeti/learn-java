package lesson_20_lambda_expression;

import java.util.List;

public class Main2 {

  public static void main(String[] args) {

    List<String> nevek = List.of("Anna", "Béla", "Csilla");

    nevek.forEach(nev -> System.out.println(nev));
    nevek.forEach(System.out::println);

  }
}

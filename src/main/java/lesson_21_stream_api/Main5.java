package lesson_21_stream_api;

import java.util.stream.IntStream;

public class Main5 {

  public static void main(String[] args) {

    // for (int i = 0; i < 5; i++)
    IntStream.range(0, 5).forEach(i -> System.out.println(i));
    // for (int i = 1; i <= 5; i++)
    IntStream.rangeClosed(1, 5).forEach(System.out::println);
    System.out.println("---");
    // for (int i = 0; i < 10; i += 2)
    IntStream.iterate(0, i -> i < 10, i -> i + 2).forEach(System.out::println);
    System.out.println("---");
    // for (int i = 5; i > 0; i--)
    IntStream.iterate(5, i -> i > 0, i -> i - 1).forEach(System.out::println);

  }
}

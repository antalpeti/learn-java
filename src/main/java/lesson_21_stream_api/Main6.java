package lesson_21_stream_api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main6 {

  public static void main(String[] args) {

    // sum – csak primitív streameken (IntStream, LongStream, DoubleStream)
    int osszeg = IntStream.rangeClosed(1, 5).sum();            // 15
    System.out.println(osszeg);
    System.out.println("---");

    // reduce – kezdőérték + összevonó művelet
    int szorzat = IntStream.rangeClosed(1, 5).reduce(2, (a, b) -> a * b);   // 240 = 2 * 1 * 2 * 3 * 4 * 5
    System.out.println(szorzat);
    System.out.println("---");

    List<Integer> szamok = List.of(3, 8, 1, 5);
    int max = szamok.stream().reduce(Integer.MIN_VALUE, Integer::max);       // 8
    System.out.println(max);
    int min = szamok.stream().reduce(Integer.MAX_VALUE, Integer::min);       // 1
    System.out.println(min);
    System.out.println("---");

    // kezdőérték nélkül Optional-t ad vissza
    int osszeg2 = szamok.stream().reduce(Integer::sum).orElse(0);            // 17
    System.out.println(osszeg2);
    System.out.println("---");

    // collect – az elemeket gyűjteménybe/összegzésbe gyűjti
    List<String> nevek = List.of("Anna", "Béla", "Csilla", "Ági");

    List<String> nagyok = nevek.stream().map(String::toUpperCase).collect(Collectors.toList());               // [ANNA, BÉLA, CSILLA, ÁGI]
    List<String> kicsik = nevek.stream().map(String::toLowerCase).collect(Collectors.toList());               // [anna, béla, csilla, ági]
    System.out.println(nagyok);
    System.out.println(kicsik);
    System.out.println("---");

    String szoveg = nevek.stream().collect(Collectors.joining(", "));          // Anna, Béla, Csilla, Ági
    System.out.println(szoveg);
    System.out.println("---");

    var hosszCsoport = nevek.stream().collect(Collectors.groupingBy(String::length));   // {3=[Ági], 4=[Anna, Béla], 6=[Csilla]}
    System.out.println(hosszCsoport);
    System.out.println("---");

    // IntStream-nél a collect helyett boxed() kell
    List<Integer> negyzetek = IntStream.rangeClosed(1, 5).map(i -> i * i).boxed()
        .collect(Collectors.toList());               // [1, 4, 9, 16, 25]
    System.out.println(negyzetek);
  }
}

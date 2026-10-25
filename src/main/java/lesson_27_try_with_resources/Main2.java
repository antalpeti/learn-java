package lesson_27_try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main2 {

  public static void main(String[] args)
      throws IOException {

    try (BufferedReader reader =
        Files.newBufferedReader(
            Path.of("adat.txt"))) {

      String sor = reader.readLine();
      System.out.println(sor);
    }
  }
}

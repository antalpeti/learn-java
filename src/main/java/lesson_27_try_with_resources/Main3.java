package lesson_27_try_with_resources;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main3 {

  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = Files.newBufferedReader(Path.of("adat.txt"));
        BufferedWriter writer = Files.newBufferedWriter(Path.of("masolat.txt"))) {
      String sor = reader.readLine();
      writer.write(sor == null ? "" : sor);
    }
  }
}

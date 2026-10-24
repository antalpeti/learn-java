package lesson_26_files_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main2 {

  public static void main(String[] args) throws IOException {

    Path fajl = Path.of("uzenet.txt");

    String tartalom = Files.readString(fajl);

    System.out.println(tartalom);

  }
}

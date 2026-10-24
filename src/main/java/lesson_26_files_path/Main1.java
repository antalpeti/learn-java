package lesson_26_files_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main1 {

  public static void main(String[] args) throws IOException {

    Path fajl = Path.of("uzenet.txt");

    Files.writeString(fajl, "Szia, Java! Na mi lesz?");

    System.out.println("Fájl elmentve.");
  }
}

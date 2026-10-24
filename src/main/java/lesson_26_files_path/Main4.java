package lesson_26_files_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main4 {

  public static void main(String[] args) throws IOException {
    Path fajl = Path.of("adat.txt");

    Files.writeString(fajl, "Alma");
    Files.writeString(fajl, "Körte");

    String eredmeny = Files.readString(fajl);

    System.out.println(eredmeny);
  }
}

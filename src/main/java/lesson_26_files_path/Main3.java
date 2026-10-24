package lesson_26_files_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main3 {

  public static void main(String[] args) throws IOException {

    Path fajl = Path.of("naplo.txt");

    Files.writeString(
        fajl,
        "Új bejegyzés\n",
        StandardOpenOption.CREATE,
        StandardOpenOption.APPEND
    );

  }
}

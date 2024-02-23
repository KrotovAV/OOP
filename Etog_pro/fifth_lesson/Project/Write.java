package fifth_lesson.Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Write {

    public static void writeFile(String text) {
        Path path = Paths.get("D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/fifth_lesson/Project/log.txt");
        String dT = DateTime.getDateTime();
        String foolText = dT + ": " + text + ";\n";

        try {
            Files.write(path, foolText.getBytes(), StandardOpenOption.APPEND);
            // System.out.println("Successfully written bytes to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

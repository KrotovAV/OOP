package Project2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Write {

    public static void writeFile(String text) {
        Path path = Paths.get("D:/GeekBrains/My Git/2 znakomstvo s iazikami/03 Java/OOP/Etog_pro/Project2/Toys.txt");
        String dT = DateTime.getDateTime();
        String foolText = dT + ": " + text + ";\n";

        try {
            Files.write(path, foolText.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// BufferedReader file1 = new BufferedReader(new InputStreamReader(
//                 new FileInputStream(args[0]), "utf8"));

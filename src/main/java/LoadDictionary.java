import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LoadDictionary {
    public static List<String> loadWords(String filePath) throws IOException
    {
        return Files.readAllLines(Paths.get(filePath));
    }
}

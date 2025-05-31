import java.io.IOException;
import java.util.List;

// Main class that only initializes everything. No work will be done here will be  creating objects and variables.
public class Google10000Words
{
    public static void main(String[] args) throws IOException
    {
        List<String> words = LoadDictionary.loadWords("google-1000-english.txt");
        DictionaryMethods analyzer = new DictionaryMethods(words);
    }
}


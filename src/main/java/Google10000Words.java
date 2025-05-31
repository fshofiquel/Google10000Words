import java.io.IOException;
import java.util.List;

// Main class that only initializes everything. No work will be done here will be  creating objects and variables.
public class Google10000Words {
    public static void main(String[] args) throws IOException
    {
        List<String> words = LoadDictionary.loadWords("google-10000-english.txt");
        DictionaryMethods analyzer = new DictionaryMethods(words);

        System.out.println("The Total Number of Words is: " + analyzer.WordCount());
        System.out.println("The First Word on the List Alphabetically Is: " + analyzer.FirstWordAlphabetically());
        System.out.println("The Last Word on the List Alphabetically Is: " + analyzer.LastWordAlphabetically());
        System.out.println("The Longest Word is: " + analyzer.LongestWord());
        System.out.println(analyzer.LongestWordThatEndsWithZZ());
    }
}


import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class DictionaryMethods {

    private final List<String> words;
    private UtilityMethods tool = new UtilityMethods();

    // This is the driver for this class and where most of the work should be done.
    public DictionaryMethods(List<String> words)
    {
        // might as well just do all the sorting here since we are initializing everything.

        this.words = words;
        this.words.sort(null);
    }

    // Counts the numbers of words in a list.
    int WordCount()
    {
        // neat little thing I just learned today. stream is op and can do a lot of un lambda things.
        return Math.toIntExact(this.words.stream().filter(word -> !word.isEmpty()).count());
    }

    String FirstWordAlphabetically()
    {
        return words.getFirst();
    }

    String LastWordAlphabetically()
    {
        return words.getLast();
    }

    String LongestWord()
    {
        this.words.sort(Comparator.comparing(String::length));
        return words.getLast();
    }

    String WordWithMostVowels()
    {
        return "test";
    }

    String WordEndingWithMostValues()
    {
        return "test";
    }

    String LongestWordThatEndsWithZZ()
    {
        List<String> ListOfLongestWordsEndingWithZZ = this.words.stream().filter(words -> words.endsWith("zz")).
                sorted(Comparator.comparing(String::length)).toList();

        return ListOfLongestWordsEndingWithZZ.getLast();
    }

    String LongestWordThatEndsWithFF()
    {
        List<String> ListOfLongestWordsEndingWithFF = this.words.stream().filter(words -> words.endsWith("ff")).
                sorted(Comparator.comparing(String::length)).toList();

        return ListOfLongestWordsEndingWithFF.getLast();
    }
}

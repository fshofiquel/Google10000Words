import java.util.List;

public class DictionaryMethods {

    private final List<String> words;

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
        // neat little thing i just learned today. stream is op and can do a lot of un lambda things.
        return Math.toIntExact(this.words.stream().filter(word -> !word.isEmpty()).count());
    }

    String FirstWordAlphabetically()
    {
        return words.getFirst();
    }

    String LastWordAlphabetically()
    {
        return words.get(9999);
    }

    String LongestWord()
    {
        return "test";
    }

    String WordWithMostVowels()
    {
        return "test";
    }

    String WordEndingWithMostVolues()
    {
        return "test";
    }

    String LongestWordThatEndsWithZZ(String suffix)
    {
        return "test";
    }

    String LongestWordThatEndsWithFF(String suffix)
    {
        return "test";
    }
}

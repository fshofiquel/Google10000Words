import java.util.Comparator;
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
        return Math.toIntExact(this.words.stream().filter(word -> !word.isEmpty()).count());
    }

    String FirstWordAlphabetically()
    {
        // Since the list is already sorted just go to the first index.
        return words.getFirst();
    }

    String LastWordAlphabetically()
    {
        // Since its sorted same logic as the previous
        return words.getLast();
    }

    String LongestWord()
    {
        // Using the Comparator method you can use comparing to simply run through and compare
        // each word and sort it by smallest to longest
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
        // This is a little complex looking however all it is doing is running lambda that is
        // checking and grabbing every word that ends with zz and then sorts the words by length
        // using a comparator. Afterward simply store all that information into a list and then
        // finally output the last index which would be the longest word ending with zz.
        List<String> ListOfLongestWordsEndingWithZZ =
                this.words.stream().filter(words -> words.endsWith("zz"))
                        .sorted(Comparator.comparing(String::length)).toList();

        return ListOfLongestWordsEndingWithZZ.getLast();
    }

    String LongestWordThatEndsWithFF()
    {
        // Same process as the zz method but instead do it for ff.
        List<String> ListOfLongestWordsEndingWithFF =
                this.words.stream().filter(words -> words.endsWith("ff"))
                        .sorted(Comparator.comparing(String::length)).toList();

        return ListOfLongestWordsEndingWithFF.getLast();
    }
}

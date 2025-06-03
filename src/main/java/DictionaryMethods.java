import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DictionaryMethods {

    private final List<String> words;
    private final UtilityMethods tools = new UtilityMethods();

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
        // Uses stream and finds the word that contains the most vowels by passing them into
        // tools object and accessing the VowelsChecker Method. This uses the max method to
        // compare each int value that is returned after a string from words is passed through
        // and finds out which word is has the most vowels.
        Optional<String> sortedByVowels =
                this.words.stream().max(Comparator.comparingInt(tools::VowelChecker));
        return sortedByVowels.orElse(null);
    }

    // Similar as the other one but for longest string of vowels at the end.
    String WordEndingWithMostVowels()
    {
        Optional<String> longestEndingVowel =
                this.words.stream().max(Comparator.comparingInt(tools::LongestEndingVowels));
        return longestEndingVowel.orElse(null);
    }


    String LongestWordSpecialEnding(String SpecialCase)
    {
        // This is a little complex looking however all it is doing is running lambda that is
        // checking and grabbing every word that ends with whatever SpecialCase is that is
        // inputted into the method and then sorts the words by length using a comparator.
        // Afterward simply store all that information into a list and then
        // finally output the last index which would be the longest word ending with whatever is
        // specified by SpecialCase.
        List<String> listOfLongestWordSpecialEnding =
                this.words.stream().filter(word -> word.endsWith(SpecialCase)).sorted(Comparator.comparing(String::length)).toList();

        return listOfLongestWordSpecialEnding.getLast();
    }
}

// Used to keep DictionaryMethods from being crowded and moves the more cluttered code to here.

public class UtilityMethods {

    // Simple Boolean checker to see if a character is a vowel
    public boolean IsVowel(char character)
    {
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    // This for loop runs through each character in a string and finds out if that letter is a
    // vowel. If it is a vowel then vowelCount++
    public int VowelChecker(String word)
    {
        int vowelCount = 0;

        for (char character : word.toCharArray()) {
            if (IsVowel(character)) vowelCount++;
        }
        return vowelCount;
    }

    // Almost similar to the other one however since we are looking for the longest chain of
    // vowels from the end then you instead start from the back and then decriment by 1 and check
    // if the letter is a vowel. If it is then it will vowelCount++ if it is not then exit the
    // string right away and return the value.
    public int LongestEndingVowels(String word)
    {
        int vowelCount = 0;
        int index = word.length() - 1;

        for (int i = index; i >= 0; i--) {
            char character;
            character = word.charAt(i);

            if (IsVowel(character)) vowelCount++;
            else break;
        }
        return vowelCount;
    }
}

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Common_Characters {
    public List<String> commonChars(String[] words) {
        // If there's only one word, return its characters
        if (words.length == 1) {
            List<String> result = new ArrayList<>();
            for (char c : words[0].toCharArray()) {
                result.add(String.valueOf(c));
            }
            return result;
        }

        List<String> result = new ArrayList<>();
        Set<Character> chars = new HashSet<>();

        // Convert the first word's characters to a set
        for (char c : words[0].toCharArray()) {
            chars.add(c);
        }

        // Check each character in the set
        for (char c : chars) {
            int frequency = Integer.MAX_VALUE;
            // Find the minimum frequency of this character in all words
            for (String word : words) {
                int count = 0;
                for (char ch : word.toCharArray()) {
                    if (ch == c) {
                        count++;
                    }
                }
                frequency = Math.min(frequency, count);
            }
            // Add the character to the result the number of times it appears in all words
            for (int i = 0; i < frequency; i++) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }
}

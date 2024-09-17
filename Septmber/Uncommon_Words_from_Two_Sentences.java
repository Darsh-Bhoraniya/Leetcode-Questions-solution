import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Uncommon_Words_from_Two_Sentences
 */
public class Uncommon_Words_from_Two_Sentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        // Create hash maps to store word frequencies for both strings
        Map<String, Integer> freqMap1 = new HashMap<>();
        Map<String, Integer> freqMap2 = new HashMap<>();
        
        // Count word frequencies for s1
        for (String word : words1) {
            freqMap1.put(word, freqMap1.getOrDefault(word, 0) + 1);
        }

        // Count word frequencies for s2
        for (String word : words2) {
            freqMap2.put(word, freqMap2.getOrDefault(word, 0) + 1);
        }

        // Create a list to store the unique words
        List<String> uniqueWords = new ArrayList<>();
        
        // Find words that are unique to s1 (appear only once in s1 and not in s2)
        for (String word : freqMap1.keySet()) {
            if (freqMap1.get(word) == 1 && !freqMap2.containsKey(word)) {
                uniqueWords.add(word);
            }
        }

        // Find words that are unique to s2 (appear only once in s2 and not in s1)
        for (String word : freqMap2.keySet()) {
            if (freqMap2.get(word) == 1 && !freqMap1.containsKey(word)) {
                uniqueWords.add(word);
            }
        }
        
       return uniqueWords.toArray(new String[0]);
    }
}
import java.util.HashMap;

public class Find_the_Longest_Substring_Containing_Vowels_in_Even_Counts {
    public int findTheLongestSubstring(String s) {
     HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // We start with an even count for all vowels
        
        int state = 0; // Bitmask to represent the current state of vowels
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Update bitmask depending on the vowel found
            if (ch == 'a') {
                state ^= (1 << 0); // Toggle the bit for 'a'
            } else if (ch == 'e') {
                state ^= (1 << 1); // Toggle the bit for 'e'
            } else if (ch == 'i') {
                state ^= (1 << 2); // Toggle the bit for 'i'
            } else if (ch == 'o') {
                state ^= (1 << 3); // Toggle the bit for 'o'
            } else if (ch == 'u') {
                state ^= (1 << 4); // Toggle the bit for 'u'
            }

            // If this state has been seen before, update the maximum length
            if (map.containsKey(state)) {
                maxLength = Math.max(maxLength, i - map.get(state));
            } else {
                // Store the first occurrence of this state
                map.put(state, i);
            }
        }

        return maxLength;
    }
}

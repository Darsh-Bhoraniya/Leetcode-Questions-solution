public class Reverse_Prefix_of_Word {
    public String reversePrefix(String word, char ch) {
        // Find the index of the character 'ch' in the word
        int index = word.indexOf(ch);
        
        // If the character is not found, return the original word
        if (index == -1)
            return word;
        
        // Reverse the substring from the beginning to the index of 'ch'
        return reverseSubstring(word, index);
    }
    
    // Reverses the substring from index 0 to 'index' in the string 's'
    private String reverseSubstring(String s, int index) {
        char[] chars = s.toCharArray();
        for (int i = 0, j = index; i < j; i++, j--) {
            // Swap characters
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}

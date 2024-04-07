public class Valid_Parenthesis_String {
    public boolean checkValidString(String s) {
        int balance = 0; // Variable to track balance of parentheses
        
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '*') {
                // If character is '(' or '*', increment balance
                balance++;
            } else {
                // If character is ')', decrement balance
                balance--;
            }
            
            // If balance becomes negative, return false immediately as string is invalid
            if (balance < 0) {
                return false;
            }
        }
        
        // Reset balance for next iteration
        balance = 0;
        
        // Iterate through each character in the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')' || c == '*') {
                // If character is ')' or '*', increment balance
                balance++;
            } else {
                // If character is '(', decrement balance
                balance--;
            }
            
            // If balance becomes negative, return false immediately as string is invalid
            if (balance < 0) {
                return false;
            }
        }
        
        // If the code reaches this point, it means all parentheses are balanced
        return true;
    }
}

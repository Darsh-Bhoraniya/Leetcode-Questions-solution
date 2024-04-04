public class Maximum_Nesting_Depth_of_the_Parentheses {
    public int maxDepth(String s) {
        int count=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') {
                count++;
            }
            max=Math.max(count,max);
            if(s.charAt(i)==')') {
                count--;
            }
        }
        return max;
    }
}



//Using Stack 

import java.util.Stack;

class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                maxDepth = Math.max(maxDepth, stack.size());
            } else if (c == ')') {
                stack.pop();
            }
        }
        return maxDepth;
    }
}


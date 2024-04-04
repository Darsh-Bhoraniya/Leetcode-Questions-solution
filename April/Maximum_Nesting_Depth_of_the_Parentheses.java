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

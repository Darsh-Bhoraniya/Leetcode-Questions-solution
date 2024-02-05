class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        for(int i=0;i<n;i++){
        char unique=s.charAt(i); 
            if(s.indexOf(unique)==s.lastIndexOf(unique)){
            return i;
            }
        }
        return -1;
    }
}

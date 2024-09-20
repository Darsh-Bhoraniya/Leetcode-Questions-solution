public class Shortest_Palindrome {
    public String shortestPalindrome(String s) {
        String rev ="";
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        String ans = s+"$"+rev;
        int lps[] = new int[ans.length()];
        lps[0] =0;
        for(int i=1;i<ans.length();i++){
            int x = lps[i-1];
            while(ans.charAt(i)!=ans.charAt(x)){
                if(x==0){
                    x =-1;
                    break;
                }
                x= lps[x-1];
            }
            lps[i] = x+1;
        }
        String  res ="";
        int k = n-lps[ans.length()-1];
        for(int i=0;i<k;i++){
            res+=rev.charAt(i);
        }
        return res+s;
        
    }
}

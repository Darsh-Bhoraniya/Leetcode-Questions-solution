import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning{
    public boolean palindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt( start++) != s.charAt(end--)){
                // start++;end--;
                return false;
            }
        }
        return true;
    }
    
    
    public void result(String s,int ind, List<List<String>> res, List<String> ds){
        if(ind == s.length()){  
            res.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i =ind; i<s.length(); ++i){
            if(palindrome(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                result(s,i+1,res,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
         result(s,0,res,ds);
         return res;
        
    }
}
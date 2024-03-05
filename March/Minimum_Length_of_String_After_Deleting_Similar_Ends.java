public class Minimum_Length_of_String_After_Deleting_Similar_Ends {
public int minimumLength(String s){
    int l = 0, r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            char ch = s.charAt(l);
            while (l <= r && s.charAt(l) == ch) l++;
            while (l <= r && s.charAt(r) == ch) r--;
        }
        if (l > r) {
            return 0;
        }
        else {
            return r - l + 1;
        }
    }
}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
     public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(st.contains(nums[i])) {
                ans.add(nums[i]);
            }
         st.add(nums[i]);
      } 
      return ans; 
    }
}

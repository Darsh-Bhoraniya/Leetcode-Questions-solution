import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Largest_Positive_Integer_That_Exists_With_Its_Negative {
    public int findMaxK(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        for(int i=n-1; i>=0; i--)
        { 
            for(int j=0; j<n; j++)
            {
                if(nums[i]==-nums[j]){  
                    return (nums[i]);
                }
            }
        }
        return -1;
    }
}

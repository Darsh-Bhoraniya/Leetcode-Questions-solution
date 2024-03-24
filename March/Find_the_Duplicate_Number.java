import java.util.Arrays;

/**
 * Find_the_Duplicate_Number
 */
public class Find_the_Duplicate_Number {
     public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
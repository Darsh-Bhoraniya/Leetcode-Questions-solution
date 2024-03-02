import java.util.Arrays;

public class Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
         int n = nums.length;
         int[] sorted = new int[n];
         for(int i=0;i<n;i++){
            // Square of the numbers of given arrays
            sorted[i]=nums[i]*nums[i];
         }
         //Short the array
         Arrays.sort(sorted);
         return sorted;
    }
}

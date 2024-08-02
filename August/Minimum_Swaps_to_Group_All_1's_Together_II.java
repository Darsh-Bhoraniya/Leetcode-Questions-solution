public class Minimum_Swaps_to_Group_All_1_s_Together_II {
    public int minSwaps(int[] nums) {
        int totalOnes = 0;
         for (int i = 0 ;i< nums.length;i++) {
             totalOnes = totalOnes+nums[i];
         }
 
         // if (totalOnes == 0) {
         //     return 0;
         // }
 
         int maxOnesInWindow = 0;
         int currentOnesInWindow = 0;
 
         // Calculate the number of ones in the first window of size totalOnes
         for (int i = 0; i < totalOnes; i++) {
             if (nums[i] == 1) {
                 currentOnesInWindow++;
             }
         }
         maxOnesInWindow = currentOnesInWindow;
 
         // Sliding window to find the max number of ones in any window of size totalOnes
         for (int i = 1; i < nums.length; i++) {
             // Remove the effect of the element going out of the window
             if (nums[i - 1] == 1) {
                 currentOnesInWindow--;
             }
             // Add the effect of the new element coming into the window
             if (nums[(i + totalOnes - 1) % nums.length] == 1) {
                 currentOnesInWindow++;
             }
             maxOnesInWindow = Math.max(maxOnesInWindow, currentOnesInWindow);
         }
 
         return totalOnes - maxOnesInWindow;
     }
}
public class Sum_of_All_Subset_XOR_Totals {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }

    // Recursive helper function to compute the subset XOR sum
    private int helper(int[] nums, int index, int currValue) {
        // Base case: if index reaches the length of nums, return the current XOR value
        if (index == nums.length) return currValue;

        // Recur by including the current element in the XOR (index+1, currValue^nums[index])
        // and by excluding the current element (index+1, currValue)
        return helper(nums, index + 1, currValue ^ nums[index]) + helper(nums, index + 1, currValue);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5};
        System.out.println(solution.subsetXORSum(nums)); // Output the result
    }
}

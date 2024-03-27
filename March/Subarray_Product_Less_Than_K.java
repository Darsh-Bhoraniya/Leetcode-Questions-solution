public class Subarray_Product_Less_Than_K {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c = 0;
		for (int i = 0; i < nums.length; i++) {
			int prod = nums[i];
			if (prod < k) {
				c++;
			}
			for (int j = i + 1; j < nums.length; j++) {
				prod *= nums[j];
				if (prod < k) {
					c++;
				} else {
					break;
				}
			}
		}
		return c;
    }
}

import java.util.HashMap;

public class Subarrays_with_K_Different_Integers{
    public int solve(int[] nums, int k) {
        if (k == 0) return 0;
        int ans = 0;
        int n = nums.length;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        int diff = 0;

        for (int l = 0, r = 0; r < n; r++) {
            cnt.put(nums[r], cnt.getOrDefault(nums[r], 0) + 1);
            if (cnt.get(nums[r]) == 1) diff++;

            while (diff > k) {
                cnt.put(nums[l], cnt.get(nums[l]) - 1);
                if (cnt.get(nums[l]) == 0) diff--;
                l++;
            }
            ans += (r - l + 1);
        }
        return ans;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k - 1);
    }
}
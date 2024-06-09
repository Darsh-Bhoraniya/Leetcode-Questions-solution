import java.util.HashMap;

public class Subarray_Sums_Divisible_by_K {
        public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, ans = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;
            if(rem < 0) rem += k;
            if(map.containsKey(rem)) ans += map.get(rem);
            map.put(rem, map.getOrDefault(rem, 0) + 1);   
        }
        return ans;
    }
}

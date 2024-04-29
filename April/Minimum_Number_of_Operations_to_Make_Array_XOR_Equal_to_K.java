public class Minimum_Number_of_Operations_to_Make_Array_XOR_Equal_to_K {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        for (int x : nums) {
            ans = ans ^ x;
        }
        ans = ans ^ k;
        int res = 0;
        while (ans > 0) {
            if ((ans & 1) != 0)
                res++;
            ans = ans >> 1;
        }
        return res;
    }
}

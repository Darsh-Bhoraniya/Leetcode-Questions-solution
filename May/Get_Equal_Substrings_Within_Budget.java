public class Get_Equal_Substrings_Within_Budget {
    public int equalSubstring(String s, String t, int maxCost) {
        int res = 0, curr = 0, n = s.length();
        int[] costs = new int[n];
        char[] str = s.toCharArray(), target = t.toCharArray();
        for (int i = 0; i < n; i++) {
            costs[i] = Math.abs(str[i] - target[i]);
        }
        for (int l = 0, r = 0; r < n; r++) {
            curr += costs[r];
            curr -= curr > maxCost ? costs[l++] : 0;
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}

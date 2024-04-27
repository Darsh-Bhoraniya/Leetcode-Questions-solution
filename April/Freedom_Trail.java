public class Freedom_Trail {
    public int findRotateSteps(String ring, String key) {
        int n = ring.length(), m = key.length();
        int[][] dp = new int[m + 1][n];
        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(ring, key, 0, 0, dp);
    }

    private int dfs(String ring, String key, int i, int j, int[][] dp) {
        if(i == key.length()) {
            return 0;
        }

        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int n = ring.length();
        int res = Integer.MAX_VALUE;
        for(int k = 0; k < n; ++k) {
            if(ring.charAt(k) == key.charAt(i)) {
                int diff = Math.abs(j - k);
                int steps = Math.min(diff, n - diff);
                res = Math.min(res, steps + dfs(ring, key, i + 1, k, dp));
            }
        }

        return dp[i][j] = res + 1;
    }
}

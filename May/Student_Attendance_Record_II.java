public class Student_Attendance_Record_II {
    private static final int MOD = 1000000007;

    public int checkRecord(int n) {
        long[][][] dp = new long[n + 1][2][3];
        dp[0][0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int a = 0; a < 2; a++) {
                for (int l = 0; l < 3; l++) {
                    dp[i][a][0] = (dp[i][a][0] + dp[i - 1][a][l]) % MOD;
                    if (a > 0) {
                        dp[i][a][0] = (dp[i][a][0] + dp[i - 1][a - 1][l]) % MOD;
                    }
                    if (l > 0) {
                        dp[i][a][l] = (dp[i][a][l] + dp[i - 1][a][l - 1]) % MOD;
                    }
                }
            }
        }

        long result = 0;
        for (int a = 0; a < 2; a++) {
            for (int l = 0; l < 3; l++) {
                result = (result + dp[n][a][l]) % MOD;
            }
        }
        return (int) result;
    }
}
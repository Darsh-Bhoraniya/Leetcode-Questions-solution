import java.util.Arrays;

public class Maximum_Total_Importance_of_Roads {
    public long maximumImportance(int n, int[][] roads) {
      long[] cnt = new long[50001];
    long res = 0;
    for (int[] r : roads) {
        ++cnt[r[0]];
        ++cnt[r[1]];
    }
    Arrays.sort(cnt, 0, n);
    for (int i = 0; i < n; ++i)
        res += cnt[i] * (i + 1);
    return res;  
    }
}

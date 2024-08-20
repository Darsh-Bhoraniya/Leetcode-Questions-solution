public class Stone_Game_II {
    int[] psum;
    public int stoneGameII(int[] piles) {
        psum = new int[piles.length];
        psum[0] = piles[0];
        for(int i = 1; i < piles.length; i++){
            psum[i] = psum[i - 1] + piles[i];
        }
        return stoneGame(0, 1, piles, new Integer[piles.length][piles.length + 1]);
    }

    public int stoneGame(int idx, int m, int[] piles, Integer[][] cache){
        if(idx == piles.length){
            return 0;
        }
        if(cache[idx][m] != null){
            return cache[idx][m];
        }
        int res = 0;
        int curr = 0;
        for(int i = idx; i < Math.min(idx + 2 * m, piles.length); i++){
            
            int nextSum = stoneGame(i + 1, Math.max(i - idx + 1, m), piles, cache);
            curr += piles[i];
            res = Math.max(res, curr + psum[piles.length - 1] - psum[i] - nextSum);
        }
        cache[idx][m] = res;
        return res;
    }
}
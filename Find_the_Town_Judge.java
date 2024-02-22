class Solution {
    public int findJudge(int n, int[][] trust) {
        if (trust.length == 0 && n == 1) 
            return 1;
        int[] trusted = new int[n + 1];
        for (int[] person : trust) {
            trusted[person[0]]--;
            trusted[person[1]]++;
        }

        for (int person = 0; person < trusted.length; person++) {
            if (trusted[person] == n - 1) return person;
        }
        return -1;
    }
}

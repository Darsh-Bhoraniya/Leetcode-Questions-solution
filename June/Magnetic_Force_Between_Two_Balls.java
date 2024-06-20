public class Magnetic_Force_Between_Two_Balls {
    private boolean isSafe(int mid, int[] position, int m) {
        int cntOfBall = 1, prevId = 0;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - position[prevId] >= mid) {
                cntOfBall++;
                prevId = i;
            }
        }
        return (cntOfBall >= m);
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 0;
        int r = position[position.length - 1];
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (isSafe(mid, position, m)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }    
}
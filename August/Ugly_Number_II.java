public class Ugly_Number_II {
    public int nthUglyNumber(int n) {
        // List<Integer> ugly = new ArrayList<>();
        // ugly.add(1);

        // // Initialize pointers for multiples of 2, 3, and 5
        // int i2 = 0, i3 = 0, i5 = 0;

        // // Continue generating ugly numbers until we reach the nth one
        // while (ugly.size() < n) {
        //     // Calculate the next candidates for ugly numbers
        //     int nextUgly2 = ugly.get(i2) * 2;
        //     int nextUgly3 = ugly.get(i3) * 3;
        //     int nextUgly5 = ugly.get(i5) * 5;

        //     // Choose the smallest candidate
        //     int nextUgly = Math.min(nextUgly2, Math.min(nextUgly3, nextUgly5));
        //     ugly.add(nextUgly);

        //     // Increment the corresponding pointer(s)
        //     if (nextUgly == nextUgly2) {
        //         i2++;
        //     }
        //     if (nextUgly == nextUgly3) {
        //         i3++;
        //     }
        //     if (nextUgly == nextUgly5) {
        //         i5++;
        //     }
        // }

        // // Return the nth ugly number
        // return ugly.get(n - 1);


        int t2 = 0, t3 = 0, t5 = 0; 
        int[] k = new int[n];
        k[0] = 1;
        
        for (int i = 1; i < n; i++) {
            k[i] = Math.min(k[t2] * 2, Math.min(k[t3] * 3, k[t5] * 5));
            
            if (k[i] == k[t2] * 2) t2++;
            if (k[i] == k[t3] * 3) t3++;
            if (k[i] == k[t5] * 5) t5++;
        }
        
        return k[n - 1];
    }
}

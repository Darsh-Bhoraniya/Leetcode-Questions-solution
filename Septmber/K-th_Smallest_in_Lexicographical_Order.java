public class K-th_Smallest_in_Lexicographical_Order {
    public int findKthNumber(int n, int k) {
        int curr = 1;
       k--; // Decrement k because we start from the first number

       while (k > 0) {
           int steps = countSteps(n, curr, curr + 1);
           if (steps <= k) {
               curr += 1;
               k -= steps;
           } else {
               curr *= 10;
               k -= 1;
           }
       }

       return curr;
   }
   private int countSteps(int n, long curr, long next) {
       int steps = 0;
       while (curr <= n) {
           steps += Math.min(n + 1, next) - curr;
           curr *= 10;
           next *= 10;
       }
       return steps;
   }
}

package June;

/**
 * Sum_of_Square_Numbers
 */
public class Sum_of_Square_Numbers {

    public boolean judgeSquareSum(int c) {
        long left = 0, right = (long) Math.sqrt(c);
        while (left <= right) {
            if (left * left + right * right == c) return true;
            else if (left * left + right * right > c) right--;
            else left++;
        }
        return false;
    }
}
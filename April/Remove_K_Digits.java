public class Remove_K_Digits {
    public static String removeKdigits(String num, int k) {
        StringBuilder res = new StringBuilder();

        for (char n : num.toCharArray()) {
            while (k > 0 && !res.isEmpty() && res.charAt(res.length() - 1) > n) {
                res.setLength(res.length() - 1);
                k--;
            }
            res.append(n);
        }

        res.setLength(res.length() - Math.min(k, res.length()));

        int start = 0;
        while (start < res.length() && res.charAt(start) == '0') {
            start++;
        }
        String ans = res.substring(start);
        return ans.isEmpty() ? "0" : ans;
    }
}

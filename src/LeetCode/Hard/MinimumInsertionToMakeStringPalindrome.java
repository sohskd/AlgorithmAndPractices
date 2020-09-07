package LeetCode.Hard;

public class MinimumInsertionToMakeStringPalindrome {

    public static void main(String[] args) {

        System.out.println(minInsertions("mbadm"));
    }

    /**
     * https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/discuss/470706/JavaC%2B%2BPython-Longest-Common-Sequence
     */
    public static int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {

                char c1 = s.charAt(i);
                char c2 = s.charAt(n - 1 - j);

                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        return n - dp[n][n];
    }
}

package GeeksForGeeks;

import java.util.Stack;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

//        String s = "ccc";

        String s = "abcb";

        System.out.println(longestPalindrome(s));
    }

//    public static String longestPalindrome(String s) {
//        int n = s.length();
//        String res = null;
//
//        boolean[][] dp = new boolean[n][n];
//
//        for (int i = n - 1; i >= 0; i--) {
//            for (int j = i; j < n; j++) {
//                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
//
//                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
//                    res = s.substring(i, j + 1);
//                }
//            }
//        }
//
//        return res;
//    }

    public static String longestPalindrome(String s) {

        int[][] dp = new int[s.length()][s.length()];
        String max = "";

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            if (s.substring(i, i + 1).length() > max.length())
                max = s.substring(i, i + 1);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == s.charAt(i)) {
                dp[i][i + 1] = 1;
                if (s.substring(i, i + 1 + 1).length() > max.length())
                    max = s.substring(i, i + 1 + 1);
            }
        }

        for (int j = 2; j < s.length(); j++) {

            for (int i = 0; i < s.length() - j; i++) {

                int iProcess = i;
                int jProcess = i + j;

                if (s.charAt(iProcess) == s.charAt(jProcess) && dp[iProcess+1][jProcess-1] == 1) {
                    dp[iProcess][jProcess] = 1;
                    if (jProcess - iProcess + 1 > max.length())
                        max = s.substring(iProcess, jProcess+1);
                }
            }
        }

        return max;
    }


    private static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;

            i++;
            j--;
        }

        return true;
    }
}

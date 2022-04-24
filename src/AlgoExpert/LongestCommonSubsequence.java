package AlgoExpert;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

//        String str1 = "8111111111111111142";
//        String str2 = "222222222822222222222222222222433333333332";

        String str1 = "ZXVVYZW";
        String str2 = "XKYKZPW";

        longestCommonSubsequence(str1, str2);

    }

    public static List<Character> longestCommonSubsequence(String str1, String str2) {
//        // Write your code here.
//
//        int[][] dp = new int[str2.length() + 1][str1.length() + 1];
//        List<Character> ans = new ArrayList<Character>();
//        int max = 0;
//
//        for (int i = 1; i < str2.length() + 1; i++) {
//
//            for (int j = 1; j < str1.length() + 1; j++) {
//
//                if (str1.charAt(j - 1) == str2.charAt(i - 1)) {
//                    dp[i][j] = dp[i - 1][j - 1] + 1;
//                    if (dp[i][j] >= max && !ans.contains(str1.charAt(j-1))) {
//                        ans.add(str1.charAt(j-1));
//                        max = dp[i][j];
//                    }
//                } else {
//                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
//                }
//            }
//        }
//
//        return ans;

        // Step 1 Build dp path
        int[][] dp = new int[str2.length() + 1][str1.length() + 1];
        for (int i = 1; i < str2.length() + 1; i++) {

            for (int j = 1; j < str1.length() + 1; j++) {

                if (str1.charAt(j - 1) == str2.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }

        // Step 2 Trace back
        List<Character> ans = new ArrayList<Character>();
        int count = dp[str2.length()][str1.length()];
        int l = str2.length();
        int r = str1.length();
        while (count > 0) {
            if (str2.charAt(l - 1) == str1.charAt(r - 1)) {
                ans.add(0,str2.charAt(l - 1));
                l = l - 1;
                r = r - 1;
                count--;
                continue;
            }
            if (dp[l][r - 1] > dp[l - 1][r]) {
                r--;
            } else {
                l--;
            }
        }
        return ans;
    }
}

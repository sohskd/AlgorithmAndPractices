package LeetCode;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        int[][] dp = new int[s.length()][s.length()];
        String max = "";

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            max = s.substring(i, i + 1);
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == s.charAt(i)) {
                dp[i][i + 1] = 1;
                max = s.substring(i, i + 1 + 1);
            }
        }

        for (int j = 2; j < s.length(); j++) {

            for (int i = 0; i < s.length() - j; i++) {

                int iProcess = i;
                int jProcess = i + j;

                if (s.charAt(iProcess) == s.charAt(jProcess) && dp[iProcess + 1][jProcess - 1] == 1) {
                    dp[iProcess][jProcess] = 1;
                    if (jProcess - iProcess + 1 > max.length())
                        max = s.substring(iProcess, jProcess + 1);
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

//        String s = "cbbd";
//        String s = "ccc";

        String s = "aaaa";

        System.out.println(longestPalindrome(s));
    }
}


//   a a a a
// a 1 1 1 1
// a 0 1 0 0
// a 0 0 1 0
// a 0 0 0 1


//   c b b d
// c 1 0 0 0
// b 0 1 1 0
// b 0 0 1 0
// d 0 0 0 1
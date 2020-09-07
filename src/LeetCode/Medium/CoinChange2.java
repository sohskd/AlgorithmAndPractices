package LeetCode.Medium;

public class CoinChange2 {

    public static void main(String[] args) {

        int[] coins = new int[] {1, 2, 5};

//        int m = change(11, coins);
        int m = change(5, coins);
    }

    public static int change(int amount, int[] coins) {

        // 4 = 2 + 2
        // 4 = 2 + 1 + 1
        // 4 = 1 + 1 + 1 + 1

        // 6 = 2 + 2 + 2
        // 6 = 1 + 1 + 1 + 1 + 1 + 1
        // 6 = 2 + 1 + 1 + 1 + 1
        // 6 = 2 + 2 + 1 + 1

        /**
         *               0, 1, 2, 3, 4, 5
         * {}            1, 0, 0, 0, 0, 0
         * { 1 }         1, 1, 1, 1, 1, 1
         * { 1, 2 }      1, 1, 2, 2, 3, 3
         * { 1, 2, 5 }   1, 1, 2, 2, 3, 4
         */

        /**
         *               0, 1, 2, 3
         * {}            1, 0, 0, 0
         * { 5 }         1, 0, 0, 0
         */

        int[][] dp = new int[coins.length + 1][amount + 1];

        // Populate the padding where there is 1 way to make 0 amount no matter what
        for (int k = 0; k < coins.length + 1; k++) {
            dp[k][0] = 1;
        }

        for (int i = 1; i < coins.length + 1; i++) {

            for (int j = 1; j < amount + 1; j++) {

                int coinToUse = coins[i - 1];

                if (j - coinToUse >= 0) {
                    // Use the coin.
                    dp[i][j] = dp[i][j - coinToUse] + dp[i - 1][j];
                } else {
                    // Don't use the coin. Move up.
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[coins.length][amount];
    }
}

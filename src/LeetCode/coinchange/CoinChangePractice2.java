package LeetCode.coinchange;

import java.util.Arrays;

public class CoinChangePractice2 {

    public static void main(String[] args) {

        CoinChangePractice2 coinChangePractice2 = new CoinChangePractice2();

//        int[] coins = {1, 2, 5};
//        int amount = 11;

        int[] coins = {2};
        int amount = 3;

        int j = coinChangePractice2.coinChange(coins, amount);

        System.out.println("Done");

    }

    int[] dp;

    public int coinChange(int[] coins, int amount) {

        dp = new int[amount + 1];

        Arrays.fill(dp, -1);

        dp[0] = 0;

        for (int i = 0; i < dp.length; i++) {
            helper(coins, i);
        }

        return dp[amount];
    }

    public int helper(int[] coins, int amount) {

        if (amount < 0)
            return 100000;

        if (dp[amount] != -1)
            return dp[amount];

        int min = -1;
        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < coins.length; j++) {

            if (amount - coins[j] < 0)
                continue;

            min = Math.min(helper(coins, amount - coins[j]) + 1, ans);
            ans = min;
        }

        dp[amount] = min;

        return 0;
    }
}

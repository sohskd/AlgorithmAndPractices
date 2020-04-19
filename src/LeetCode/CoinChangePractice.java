package LeetCode;

public class CoinChangePractice {

    public static void main(String[] args) {

//        int[] coins = {1, 2, 5};
//        int[] memo = new int[11];
//        int amount = 11;

        int[] coins = {2};
        int amount = 3;
        int[] memo = new int[3];

        int j = coinChange(coins, amount, memo);

        System.out.println("Done");
    }

    private static int coinChange(int[] coins, int amount, int[] memo) {

        if (amount < 0)
            return -1;

        if (amount == 0)
            return 0;

        if (memo[amount-1] != 0)
            return memo[amount-1];

        int mini = Integer.MAX_VALUE;

        for (int coin: coins) {

            int result = coinChange(coins, amount-coin, memo);
            if (result >= 0 && result < mini)
                mini = 1 + result;
        }

        // Save the result in memo
        if (mini == Integer.MAX_VALUE)
            memo[amount-1] = -1;
        else
            memo[amount-1] = mini;

        return memo[amount-1];
    }
}

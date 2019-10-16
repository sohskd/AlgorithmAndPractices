package LeetCode;

public class CoinChange {

    public static void main(String[] args) {

        CoinChange coinChange = new CoinChange();

//        int[] coins = {186, 419, 83, 408};
        int[] coins = {1, 2, 5};
        int amount = 11;

        int move = coinChange.coinChange(coins, amount);
        System.out.println("Done");
    }

    public int coinChange(int[] coins, int amount) {

        if (amount < 1)
            return 0;
        return helper(coins, amount, new int[amount]);
    }

    private int helper(int[] coins, int amount, int[] count) {
        // rem: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem

        if (amount < 0)
            return -1; // not valid

        if (amount == 0)
            return 0; // completed

        if (count[amount - 1] != 0)
            return count[amount - 1]; // already computed, so reuse

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {

            int res = helper(coins, amount - coin, count);
            if (res >= 0 && res < min)
                min = 1 + res;
        }

        if (min == Integer.MAX_VALUE) {
            count[amount - 1] = -1;
        } else {
            count[amount - 1] = min;
        }

        return count[amount - 1];
    }
}

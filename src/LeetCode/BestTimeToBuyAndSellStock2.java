package LeetCode;

public class BestTimeToBuyAndSellStock2 {

    public static void main(String[] args) {
        int[] prices = new int[] {1, 2, 1, 4, 5};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                int p = prices[i + 1] - prices[i];
                profit = profit + p;
            }
        }

        return profit;
    }
}

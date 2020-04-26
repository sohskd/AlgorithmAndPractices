package LeetCode.coinchange;

public class CoinChangePractice3 {

    public static void main(String[] args) {

        int amount = 6249;
        int[] coins = new int[]{186, 419, 83, 408};
//
//        int amount = 11;
//        int[] coins = new int[] {1, 2, 5};

        int[] ans = new int[amount + 1];
        ans[0] = 0;
        for (int j = 1; j < ans.length; j++) {
            ans[j] = amount + 1;
        }

        for (int i = 1; i < ans.length; i++) {
            int amt = i;
            for (int k = 0; k < coins.length; k++) {
                int val = amt - coins[k];
                if (val >= 0)
                    ans[i] = Math.min(ans[val] + 1, ans[i]);
            }
        }

        if (ans[amount] > amount)
            System.out.println(-1);
        else
            System.out.println(ans[amount]);

//        return ans[amount] > amount ? -1 : ans[amount];
    }
}

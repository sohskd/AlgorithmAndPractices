package LeetCode;

public class ClimbStairs {

    public static void main(String[] args) {

        ClimbStairs climbStairs = new ClimbStairs();

        System.out.println(climbStairs.climbStairs(1));
    }

    int[] dp;

    public int climbStairs(int n) {

        if (n <= 2)
            return n;

        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            helper(i);
        }

        return dp[n];
    }

    public int helper(int n) {

        if (dp[n] != 0)
            return dp[n];

        dp[n] = helper(n-1) + helper(n-2);

        return 0;
    }
}

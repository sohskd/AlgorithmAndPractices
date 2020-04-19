package LeetCode;

public class Fibonacci2 {

    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8 ...
        //0, 1, 2, 3, 4, 5, 6

        System.out.println(fibWrapper(4));

    }

    public static int fibWrapper(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        int val = fibonacci(4, dp);
        return  val;
    }

    public static int fibonacci(int n, int[] dp) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        if (dp[n] != 0)
            return dp[n];

        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

        return dp[n];
    }
}

package GeeksForGeeks.DynamicProgramming;

import java.util.Arrays;

public class FactorialTopDown {

    int[] dp = new int[10];

    public static void main(String[] args) {
        FactorialTopDown factorialTopDown = new FactorialTopDown();
        System.out.println(factorialTopDown.solve(5));
        System.out.println(factorialTopDown.solve(5));
    }

    public int solve(int x) {
        if (x == 0)
            dp[0] = 1;
        if (dp[x] != 0)
            return dp[x];
        dp[x] = x * solve(x - 1);
        return dp[x];
    }
}

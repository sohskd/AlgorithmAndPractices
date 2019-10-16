package LeetCode;

public class Fibonacci {

    public static void main(String[] args) {

        int memo[] = new int[] {0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0};


        System.out.println(fib(6, memo));
    }

    public static int fib(int n, int[] memo) {

        if (memo[n] != 0) {
            return memo[n];
        }

        if (n == 0) {
            return 0;
        }

        if (n <= 2)
            return 1;
        else {
            int i = fib(n-1, memo);
            int j = fib(n-2, memo);
            memo[n] = i + j;
            return i + j;
        }

    }
}

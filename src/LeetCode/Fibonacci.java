package LeetCode;

public class Fibonacci {

    int fib_cache[] = new int[31];

    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();

        System.out.println(f.fib(6));
    }

    public int fib(int N) {

        if(N <= 1)
            return N;
        else if(fib_cache[N] != 0)
            return fib_cache[N];
        else
            return fib_cache[N] = fib(N - 1) + fib(N - 2);

    }
}

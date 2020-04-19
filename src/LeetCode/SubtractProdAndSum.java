package LeetCode;

public class SubtractProdAndSum {

    public static void main(String[] args) {

        int n = 234;

        int prod = 1;
        int sum = 0;

        String intStr = Integer.toString(n);

        for(int j = 0; j < intStr.length(); j++) {
            int digit = n%10;

            prod *= digit;
            sum += digit;

            n /= 10;
        }

        System.out.println(prod-sum);
    }
}

package LeetCode;

public class maxProfit {

    public static void main(String[] args) {

        int[] prices = new int[] {7,1,5,3,6,4};

        int min = Integer.MAX_VALUE, max = 0;
        for (int price: prices) {
            min = Math.min(min, price);
            max = Math.max(price - min, max);
        }

        System.out.println(max);
    }
}

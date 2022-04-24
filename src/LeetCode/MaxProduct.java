package LeetCode;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxProduct {


    public static void main(String[] args) {
//        int[] nums = new int[]{2, 3, -2, 4};
//        int[] nums = new int[]{-3, -1, -1};
        int[] nums = new int[]{-2, 0, -5, 6, -1, -7, 1, -3};

        maxProduct(nums);
    }

    public static int maxProduct(int[] nums) {

        int prod = 1;
        int result = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            result = Math.max(prod, result);
            if (prod == 0) {
                prod = 1;
            }
        }
        prod = 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            prod = prod * nums[i];
            result = Math.max(prod, result);
            if (prod == 0) {
                prod = 1;
            }
        }
        return result;
    }
}

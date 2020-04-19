package LeetCode;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] val = new int[] {-2,1,-3,4,-1,2,1,-5,4};

//        System.out.println(maxSubArray(val));
        System.out.println(maxSubArrayDp(val));
    }

    public static int maxSubArray(int[] nums) {
        int max = -Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum > max)
                    max = sum;
            }
        }

        return max;
    }

    public static int maxSubArrayDp(int[] nums) {

        if (nums.length <= 0)
            return 0;

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = Integer.MIN_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + dp[i - 1] > nums[i])
                dp[i] = nums[i] + dp[i - 1];
            else
                dp[i] = nums[i];

            if (dp[i] > max)
                max = dp[i];
        }

        return max;
    }
}

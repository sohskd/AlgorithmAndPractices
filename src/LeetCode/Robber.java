package LeetCode;

public class Robber {

    public static void main(String[] args) {
        Robber r = new Robber();
//        r.rob(new int[]{1,2,3,1});
//        r.rob(new int[]{2,7,9,3,1});
        r.rob(new int[]{2,1,1,2});
    }

    public int rob(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2)
            if (nums[0] < nums[1]) return nums[1];
            else return nums[0];

        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        ans[1] = nums[1];

        int i;
        for (i = 2; i < nums.length; i++) {
            int a = nums[i] + ans[i - 2];
            if (a > ans[i - 1])
                ans[i] = a;
            else
                ans[i] = ans[i - 1];
        }

        if (ans[i - 1] > ans[i - 2])
            return ans[i - 1];
        else
            return ans[i - 2];
    }
}

// 1, 2, 4, 3

// 2, 7, 11, 10, 12
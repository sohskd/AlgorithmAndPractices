package LeetCode;

public class HouseRobber {

    public static void main(String[] args) {

//        int arr[] = new int[] {2, 7, 9, 3, 1};

        int arr[] = new int[] {1, 2, 3, 1};

        rob(arr);
    }

    private static int rob(int[] nums) {
//        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int val = 0;
//            for (int j = i; j < nums.length; j += 2) {
//                val += nums[j];
//                if (val > max)
//                    max = val;
//            }
//        }
//        return max;

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = 0;
            for (int j = i; j < nums.length; j += 2) {

                int test2 = 0;
                if (j + 1 < nums.length) {
                    test2 = val;
                    test2 += nums[j + 1];
                }

                val += nums[j];

                if (test2 > val)
                    val = test2;

                if (val > max)
                    max = val;
            }
        }
        return max;
    }
}

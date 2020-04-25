package LeetCode;

public class MoveZeros {

    public static void main(String[] args) {
//        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] nums = new int[]{4, 1, 2, 0, 12, 0, 13};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        if (nums.length < 0) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    private static void swap(int k, int j, int[] nums) {
        int temp = nums[k];
        nums[k] = nums[j];
        nums[j] = temp;
    }
}

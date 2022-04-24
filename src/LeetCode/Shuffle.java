package LeetCode;

public class Shuffle {

    public static void main(String[] args) {

        int left = 4 << 10;

        int[] arr = new int[]{2, 5, 1, 3, 4, 7};

        Shuffle.shuffle(arr, 3);
    }

    public static int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < n; ++i) {
            int left = nums[i] << 10;
            nums[i + n] |= left;
        }
        for (int i = 0; i < n; ++i) {
            nums[i * 2] = (nums[i + n] & 0xFFC00) >> 10;     // 11111111110000000000 == 0xFFC00
            nums[i * 2 + 1] = nums[i + n] & 0x003FF;        // 00000000001111111111 == 0x003FF
        }
        return nums;
    }
}
package LeetCode;

import java.util.HashSet;

public class ContainsDuplicates2 {

    public static void main(String[] args) {
        System.out.println(c(new int[] { 1, 2, 3, 1, 2, 3 }, 2));
    }

    public static boolean c(int[] nums, int k) {
        HashSet<Integer> h = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (h.size() > k)
                h.remove(nums[i - k - 1]);
            if (h.contains(nums[i]))
                return true;
            h.add(nums[i]);

        }

        return false;
    }
}

package LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {

        int[] nums = new int[] {1, 2, 3};

        List<List<Integer>> a =  subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    private static void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] nums, int k) {

        ans.add(new ArrayList<>(temp));
        for (int i = k; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(ans, temp, nums, ++k);
            temp.remove(temp.size() - 1);
        }
    }
}

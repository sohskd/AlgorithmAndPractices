package LeetCode.Medium;

import java.util.*;

public class Permutations2 {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 1, 2};

        permuteUnique(nums);

    }

    public static List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {

        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i])
                    continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
                while (i + 1 < nums.length && nums[i] == nums[i + 1])
                    ++i;
            }
        }
    }
}

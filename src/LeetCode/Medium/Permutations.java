package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        int[] nums = new int[] {1, 2, 3};

        permute(nums);
    }

    public static List<List<Integer>> permute(int[] nums) {

        if (nums.length == 0)
            return null;

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(ans, tempList, nums);

        return ans;
    }

    private static void backtrack(List<List<Integer>> ans, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            ans.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                // if the number is in the tempList, don't put it in.
                if (tempList.contains(nums[i]))
                    continue;
                tempList.add(nums[i]);
                backtrack(ans, tempList, nums);
                // Remove the last element and add the next to permute.
                tempList.remove(tempList.size() - 1);
            }
        }
    }

//    public static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        // Arrays.sort(nums); // not necessary
//        backtrack(list, new ArrayList<>(), nums);
//        return list;
//    }
//
//    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
//        if(tempList.size() == nums.length){
//            list.add(new ArrayList<>(tempList));
//        } else{
//            for(int i = 0; i < nums.length; i++){
//                if(tempList.contains(nums[i])) continue; // element already exists, skip
//                tempList.add(nums[i]);
//                backtrack(list, tempList, nums);
//                tempList.remove(tempList.size() - 1);
//            }
//        }
//    }
}

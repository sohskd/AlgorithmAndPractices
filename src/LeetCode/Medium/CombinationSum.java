package LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        int[] candidates = new int[] {2, 3, 6, 7};

        combinationSum(candidates, 7);


    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(ans, temp, candidates, target, 0);

        return ans;
    }

    private static List<Integer> backtrack(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int start)       {
        if (target < 0) {
            return null;
        }

        if (target == 0) {
            ans.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i < candidates.length; i++) {
                temp.add(candidates[i]);
                backtrack(ans, temp, candidates, target - candidates[i], i);
                temp.remove(temp.size() - 1);
            }
        }

        return null;
    }
}

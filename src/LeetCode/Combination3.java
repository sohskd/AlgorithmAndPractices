package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combination3 {

    public static void main(String[] args) {

        combinationSum3(3, 7);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(ans, temp, k, n, 1, 0);
        return ans;
    }

    public static void backtrack(List<List<Integer>> ans, List<Integer> temp, int k, int n, int start, int sum) {

        if (temp.size() == k && sum == n) {
            ans.add(new ArrayList<>(temp));
        }
        else if (temp.size() == k) {
            return;
        } else {
            for (int i = start; i <= 9; i++) {
                temp.add(i);
                sum += i;
                backtrack(ans, temp, k, n, i + 1, sum);
                sum -= i;
                temp.remove(temp.size() - 1);
            }
        }
    }
}

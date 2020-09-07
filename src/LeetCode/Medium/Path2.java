package LeetCode.Medium;

import LeetCode.BinaryTreePath;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Path2 {

    public List<List<Integer>> pathSum(BinaryTreePath.TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        recurse(root, ans, temp, sum);
        return ans;
    }

    private void recurse(BinaryTreePath.TreeNode root, List<List<Integer>> ans, List<Integer> temp, int sum) {
        if (root == null)
            return;
        temp.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            ans.add(new ArrayList<>(temp));
            temp.remove(temp.size() - 1);
        } else {
            recurse(root.left, ans, temp, sum - root.val);
            recurse(root.right, ans, temp, sum - root.val);
        }

        // temp.remove(temp.size() - 1);

    }

    public List<List<Integer>> pathSum2(BinaryTreePath.TreeNode root, int sum){
        List<List<Integer>> result  = new LinkedList<List<Integer>>();
        List<Integer> currentResult  = new LinkedList<Integer>();
        pathSum(root,sum,currentResult,result);
        return result;
    }

    public void pathSum(BinaryTreePath.TreeNode root, int sum, List<Integer> currentResult,
                        List<List<Integer>> result) {

        if (root == null)
            return;
        currentResult.add(new Integer(root.val));
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new LinkedList(currentResult));
            currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
            return;
        } else {
            pathSum(root.left, sum - root.val, currentResult, result);
            pathSum(root.right, sum - root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);
    }
}

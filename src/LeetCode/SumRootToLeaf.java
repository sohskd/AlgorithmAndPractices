package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeaf {

    private int total = 0;

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

//        TreeNode root = new TreeNode(0);

        SumRootToLeaf sumRootToLeaf = new SumRootToLeaf();

        sumRootToLeaf.sumRootToLeaf(root);

        System.out.println(sumRootToLeaf.total);
    }

    public int sumRootToLeaf(TreeNode root) {
        recurse(root, 0);
        return total;
    }

    // 2n, 2n + 1
    private void recurse(TreeNode root, int val) {
        if (root == null)
            return;
        else {
            val = val << 1 | root.val;

//            val = val << 1;

            if (root.left == null && root.right == null)
                total += val;
            recurse(root.left, val);
            recurse(root.right, val);
        }
    }

    /**
     * public static int sumRootToLeaf(TreeNode root) {
     * List<Integer> temp = new ArrayList<>();
     * List<Integer> ans = new ArrayList<>();
     * recurse(root, temp, ans);
     * int sum = 0;
     * for (int i = 0; i < ans.size(); i++) {
     * sum += ans.get(i);
     * }
     * return sum;
     * }
     * <p>
     * // 2n, 2n + 1
     * private static void recurse(TreeNode root, List<Integer> temp, List<Integer> ans) {
     * if (root == null)
     * return;
     * else {
     * temp.add(0, root.val);
     * recurse(root.left, temp, ans);
     * recurse(root.right, temp, ans);
     * if (root.left == null && root.right == null)
     * ans.add(sum(temp));
     * temp.remove(0);
     * }
     * }
     * <p>
     * private static int sum(List<Integer> l) {
     * int sum = 0;
     * int twos = 0;
     * for (int i = 0; i < l.size(); i++) {
     * int val = l.get(i);
     * if (val == 1)
     * sum += Math.pow(2, twos);
     * twos++;
     * }
     * return sum;
     * }
     **/


    public static class TreeNode {

        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

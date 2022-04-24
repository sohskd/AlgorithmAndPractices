package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class binaryNumbersSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        int sum = sumRootToLeaf(root);
    }

    public static int sumRootToLeaf(TreeNode root) {
        Integer[] sumArr = new Integer[1001];
        List<TreeNode> l = new ArrayList<>();
        countNodes(root, l);
        recurse(root, sumArr, 1);
        int sum = 0;
        int twos = 0;
        for (int i = l.size(); i >= 1; i--) {
            int val = sumArr[i];
            if (val == 1)
                sum += Math.pow(2, twos);
            twos++;
        }
        return sum;
    }

    private static void countNodes(TreeNode root, List<TreeNode> nodeList) {
        if (root == null)
            return;
        nodeList.add(root);
        countNodes(root.left, nodeList);
        countNodes(root.right, nodeList);
    }

    // 2n, 2n + 1
    private static void recurse(TreeNode root, Integer[] sumArr, int idx) {
        if (root == null)
            return;
        sumArr[idx] = root.val;
        recurse(root.left, sumArr, 2*idx);
        recurse(root.right, sumArr, 2*idx + 1);
    }

    public static class TreeNode {

        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

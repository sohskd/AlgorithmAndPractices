package LeetCode;

public class DiameterOfBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(find(root));
    }

    public static int diameterOfBinaryTreeHelp(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(diameterOfBinaryTreeHelp(root.left), diameterOfBinaryTreeHelp(root.right));
    }

    public static int find(TreeNode root) {
        if (root == null)
            return 0;
        return diameterOfBinaryTreeHelp(root.left) + diameterOfBinaryTreeHelp(root.right);
    }
}

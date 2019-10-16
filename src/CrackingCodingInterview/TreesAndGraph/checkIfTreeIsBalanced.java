package CrackingCodingInterview.TreesAndGraph;

public class checkIfTreeIsBalanced {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
//        node.right = new TreeNode(4);
//        node.right.right = new TreeNode(4);s

        System.out.println(isBalanced(node));
    }

    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }


    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static boolean isBalanced(TreeNode root) {
        int maxd = maxDepth(root);
        int mind = minDepth(root);
        return (maxd - mind <= 1);
    }
}

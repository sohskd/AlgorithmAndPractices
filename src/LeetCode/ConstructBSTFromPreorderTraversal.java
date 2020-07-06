package LeetCode;

public class ConstructBSTFromPreorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        int[] myArr = new int[] {8,5,1,7,10,12};
        bstFromPreorder(myArr);
    }

    public static TreeNode bstFromPreorder(int[] preorder) {

        if (preorder.length == 0)
            return null;

        TreeNode treeNode = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {
            treeNode = insert(treeNode, preorder[i]);
        }

        return treeNode;
    }

    private static TreeNode insert(TreeNode treeNode, int val) {

        if (treeNode == null) {
            return new TreeNode(val);
        }

        if (val < treeNode.val) {
            treeNode.left = insert(treeNode.left, val);
        } else {
            treeNode.right = insert(treeNode.right, val);
        }

        return treeNode;
    }
}

package LeetCode.Medium;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class PathSum3 {

    public static void main(String[] args) {

        // root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8

//        TreeNode t = new TreeNode();
//        t.val = 10;
//        t.left = new TreeNode(5);
//        t.left.left = new TreeNode(3);
//        t.left.right = new TreeNode(2);
//        t.left.right.right = new TreeNode(1);
//        t.left.left.left = new TreeNode(3);
//        t.left.left.right = new TreeNode(-2);
//        t.right = new TreeNode(-3);
//        t.right.right = new TreeNode(11);

        TreeNode t = new TreeNode();
        t.val = 10;
        t.left = new TreeNode(5);
        t.left.left = new TreeNode(1000);
        t.left.right = new TreeNode(2);
        t.left.right.right = new TreeNode(1);
        t.left.left.left = new TreeNode(3);
        t.left.left.right = new TreeNode(0);
        t.right = new TreeNode(-3);
        t.right.right = new TreeNode(11);

        PathSum3 pathSum3 = new PathSum3();
        int val = pathSum3.pathSum(t, 1003);
        System.out.println(val);
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        int a = pathSumFrom(root, sum);
        int b = pathSum(root.left, sum);
        int c = pathSum(root.right, sum);
        return a + b + c;
    }

    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null)
            return 0;
        else {
            int d = (node.val == sum ? 1 : 0);
            int e = pathSumFrom(node.left, sum - node.val);
            int f = pathSumFrom(node.right, sum - node.val);
            return d + e + f;
        }
    }

//    public int pathSum(TreeNode root, int sum) {
//
//        if (root == null)
//            return 0;
//
//        int a = pathSumFrom(root, sum);
//        int b = pathSumFrom(root.left, sum);
//        int c = pathSumFrom(root.right, sum);
//
//        return a + b + c;
//    }
//
//    private int pathSumFrom(TreeNode node, int sum) {
//        if (node == null)
//            return 0;
//        else {
//            int d = (node.val  == sum) ? 1 : 0;
//            int e = pathSumFrom(node.left, sum - node.val);
//            int f = pathSumFrom(node.right, sum - node.val);
//            return d + e + f;
//        }
//    }
}

class TreeNode {
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

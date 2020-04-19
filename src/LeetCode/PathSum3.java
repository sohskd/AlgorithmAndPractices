package LeetCode;

public class PathSum3 {

    public static void main(String[] args) {
        DiameterOfBinaryTree.TreeNode treeNode = new DiameterOfBinaryTree.TreeNode(10);
        treeNode.left = new DiameterOfBinaryTree.TreeNode(5);
        treeNode.right = new DiameterOfBinaryTree.TreeNode(-3);
        treeNode.right.right = new DiameterOfBinaryTree.TreeNode(11);
        treeNode.left.left = new DiameterOfBinaryTree.TreeNode(3);
        treeNode.left.right = new DiameterOfBinaryTree.TreeNode(2);
        treeNode.left.right.right = new DiameterOfBinaryTree.TreeNode(1);
        treeNode.left.left.left = new DiameterOfBinaryTree.TreeNode(3);
        treeNode.left.left.right = new DiameterOfBinaryTree.TreeNode(-2);

        PathSum3 pathSum3 = new PathSum3();
        pathSum3.pathSum(treeNode, 8);
        System.out.println(pathSum3.count);

    }

    int count = 0;

    public int pathSum(DiameterOfBinaryTree.TreeNode root, int sum) {

        findCount(root, sum, sum);
        return count;
    }

    public int findCount(DiameterOfBinaryTree.TreeNode root, int sum, int currentSum) {
        if (root == null) {
            if (currentSum == 0) {
                this.count += 1;
            }
            return 0;
        }

        currentSum -= root.val;

        if (currentSum == 0) {
            this.count += 1;
            currentSum = sum;
        }

        int tmp = currentSum;

        if (root.left == null || currentSum - root.left.val != 0)
            currentSum = sum;

        findCount(root.left, sum, currentSum);

        if (root.right == null || tmp - root.right.val != 0)
            tmp = sum;

        findCount(root.right, sum, tmp);

        return 0;
    }
}

package LeetCode;

import DataStructure.TreeTraversal.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        BinaryTreePath binaryTreePath = new BinaryTreePath();
        binaryTreePath.binaryTreePaths(root);
    }

    public List<Integer> findPath(List<Integer> myArr, List<List<Integer>> answer, TreeNode node) {

        if (node == null)
            return null;

        myArr.add(node.val);

        List<Integer> myArrLeft = findPath(myArr, answer, node.left);

        List<Integer> myArrRight = findPath(myArr, answer, node.right);

        if (myArrLeft == null && myArrRight == null) {
            // Set the list of string
            List<Integer> newList = new ArrayList<>(myArr);
            answer.add(newList);
        }

        // Return minus 1
        myArr.remove(myArr.size() - 1);
        return myArr;
    }

    public List<String> binaryTreePaths(TreeNode root) {

        List<Integer> myArr = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        List<String> answerInStr = new ArrayList<>();

        findPath(myArr, answer, root);

        System.out.println(answer);

        for (List<Integer> listInt : answer) {

            String s = "";
            for (Integer i : listInt) {

                s += i + "->";
            }
            s = s.substring(0, s.length() - 2);
            answerInStr.add(s);
        }

        return answerInStr;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}


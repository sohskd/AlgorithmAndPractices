package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaticExperiment {

    public static void main(String[] args) {

        Random random = new Random();
        random.nextBoolean();

        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        int j = i.stream().reduce(0, (a, b) -> a+b);
        System.out.println(j);

//        StaticExperiment tree = new StaticExperiment(10);
//        tree.findClosestValueInBst(tree, 12);

//        List<Integer> ans = new ArrayList<>();
//        List<Integer> b = new ArrayList<>();
//        b.add(10);
//        helpme(ans, b);
//        System.out.println(ans.size());
    }

//    public static void helpme(List<Integer> a, List<Integer> b) {
////        List<Integer> l = new ArrayList<>();
////        l.add(100);
////        a = l;
//        a.add(1);
//        a.add(11);
//    }

    public int findClosestValueInBst(StaticExperiment tree, int target) {
        // Write your code here.
        // if (tree == null)
        // 	return 0;

        StaticExperiment node = new StaticExperiment(-1);
        System.out.println(tree.value);
        helper(tree, target, Integer.MAX_VALUE, node);
        System.out.println(node.value);
        return node.value;
    }

    public void helper(StaticExperiment tree, int target, int diff, StaticExperiment node) {

        if (tree == null) {
            return;
        }

        node.value = 999;
        return;

//         int temp = Math.abs(tree.value - target);
//         if (temp < diff) {
//         	node = tree;
//         	diff = temp;
//         }
//
//         if (target < tree.value) {
//         	helper(tree.left, target, diff, node);
//         } else {
//         	helper(tree.right, target, diff, node);
//         }
    }


    //     class BST {
    public int value;
    public StaticExperiment left;
    public StaticExperiment right;

    public StaticExperiment(int value) {
        this.value = value;
    }
//    }
}

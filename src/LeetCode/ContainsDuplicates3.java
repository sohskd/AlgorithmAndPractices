package LeetCode;

import java.util.Arrays;
import java.util.TreeSet;

public class ContainsDuplicates3 {

    public static void main(String[] args) {

//        int[] a = new int[]{-1, 2147483647};
//        long[] longArray = Arrays.stream(a).mapToLong(i -> i).toArray();
//        int k = 1;
//        int t = 2147483647;


//        int[] a = new int[]{1, 2, 3, 9};
//        long[] longArray = Arrays.stream(a).mapToLong(i -> i).toArray();
//        int k = 3;
//        int t = 0;

        int[] a = new int[]{1, 5, 9, 1, 5, 9};
        long[] longArray = Arrays.stream(a).mapToLong(i -> i).toArray();
        int k = 2;
        int t = 3;

        System.out.println(containsNearbyAlmostDuplicate(longArray, k, t));
    }

    // 1) iterate 1 to n.
    // 2) if hashset size < k, add the element, then continue.
    // 3) if hashset size == k + 1, find the element that satisfy k & t.

    // k = 3, t = 0
    // long[] nums = new long[] { 1, 2, 3, 1 };

    // { 1, 1, 2 }

    public static boolean containsNearbyAlmostDuplicate(long[] nums, int k, int t) {
        TreeSet<Long> treeSet = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (!treeSet.isEmpty() && treeSet.floor(nums[i]) != null && Math.abs(nums[i] - treeSet.floor(nums[i])) <= t ||
                    !treeSet.isEmpty() && treeSet.ceiling(nums[i]) != null && Math.abs(nums[i] - treeSet.ceiling(nums[i])) <= t)
                return true;

            treeSet.add(nums[i]);
            if (treeSet.size() > k)
                treeSet.remove(nums[i - k]);
        }

        return false;
    }
}

package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class findKthLargest {

    public static void main(String[] args) {

        int[] myArr = new int[]{3, 2, 1, 5, 6, 4};
//        findKthLargestMethod(myArr, 2);

        test(5);
    }

    public static int findKthLargestMethod(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        minHeap.add(10);
        minHeap.add(9);

        for (int i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }

    private static void test(int num) {
        System.out.println(Integer.toBinaryString(num));
    }
}

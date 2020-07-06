package LeetCode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class lastStoneWeight {

    public static void main(String[] args) {

        int[] stone = new int[] {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stone));
    }

//    public static int lastStoneWeight(int[] stones) {
//
//        if (stones.length < 0)
//            return 0;
//        else if (stones.length == 1)
//            return stones[0];
//        else {
//            int diff = Math.max(stones[1], stones[0]) - Math.min(stones[1], stones[0]);
//            for (int j = 2; j < stones.length; j++) {
//                diff = Math.max(stones[j], diff) - Math.min(stones[j], diff);
//            }
//            return diff;
//        }
//    }

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i2 - i1;
            }
        });

        for (int k = 0; k < stones.length; k++) {
            maxHeap.add(stones[k]);
        }

        int i, j;

        while (maxHeap.size() > 1) {
            i = maxHeap.poll();
            j = maxHeap.poll();
            int diff = i - j;
            if (diff != 0)
                maxHeap.add(diff);
        }

        return maxHeap.size() != 0 ? maxHeap.poll() : 0;
    }
}

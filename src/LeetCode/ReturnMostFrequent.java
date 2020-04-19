package LeetCode;

import java.util.HashMap;

public class ReturnMostFrequent {

    public static void main(String[] args) {

        int[] a = new int[]{-4, -4, -4, -4, 1, 1, 1, 2, 2, 2, 3, 3, 3};

        System.out.println(returnMostFrequent(a));
    }

    public static int returnMostFrequent(int[] a) {

        HashMap<Integer, Integer> h = new HashMap<>();

        int val;
        int max = 0;
        int maxInt = a[0];

        for (int i = 0; i < a.length; i++) {
            val = h.getOrDefault(a[i], 0);
            val += 1;
            if (val > max) {
                maxInt = a[i];
                max = val;
            }
            h.put(a[i], val);
        }

        return maxInt;
    }
}

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LuckyNumberInAMatrix {

    public static void main(String[] args) {

//        int[][] m = new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};

        int[][] m = new int[][]{{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        System.out.println(luckyNumbers(m).toString());
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] mi = new int[m], mx = new int[n];
        Arrays.fill(mi, Integer.MAX_VALUE);
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (mi[i] == mx[j])
                    res.add(mi[i]);
        return res;
    }

    /*
    public static List<Integer> luckyNumbers(int[][] matrix) {
        HashMap<Integer, List<Integer>> h = new HashMap<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            List<Integer> myList = new ArrayList<>();
            myList.add(minIndex);
            myList.add(min);
            h.put(i, myList);
        }

        for (Integer l : h.keySet()) {
            int idx = h.get(l).get(0);
            int max = Integer.MIN_VALUE;
            for (int k = 0; k < matrix.length; k++) {
                int val = matrix[k][idx];
                if (val > max) {
                    max = val;
                }
            }
            if (max == h.get(l).get(1)) {
                List<Integer> ans = new ArrayList<>();
                ans.add(max);
                return ans;
            }
        }
        return new ArrayList<>();
    }
    */
}

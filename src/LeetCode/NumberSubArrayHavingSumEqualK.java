package LeetCode;

import java.util.HashMap;

public class NumberSubArrayHavingSumEqualK {

    public static void main(String[] args) {

        int[] myArr = new int[] {10, 2, -2, -20, 10};
        findSubarraySum(myArr, myArr.length,-10);
    }

    static int findSubarraySum(int arr[], int n, int sum) {

        HashMap<Integer, Integer> prevSum = new HashMap<>();
        int res = 0;
        int currsum = 0;

        for (int i = 0; i < n; i++) {
            currsum += arr[i];
            if (currsum == sum)
                res++;
            if (prevSum.containsKey(currsum - sum))
                res += prevSum.get(currsum - sum);
            Integer count = prevSum.get(currsum);
            if (count == null)
                prevSum.put(currsum, 1);
            else
                prevSum.put(currsum, count + 1);
        }

        return res;
    }
}

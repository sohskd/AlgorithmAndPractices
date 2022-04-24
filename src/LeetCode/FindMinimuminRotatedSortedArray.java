package LeetCode;

public class FindMinimuminRotatedSortedArray {

    public static void main(String[] args) {

//        int[] input = new int[]{5, 1, 2, 3, 4};
        int[] input = new int[]{2,3,4,5,1};
        System.out.println(findMin(input));
    }

    public static int findMin(int[] num) {

        int low = 0, high = num.length - 1;
        // loop invariant: 1. low < high
        //                 2. mid != high and thus A[mid] != A[high] (no duplicate exists)
        //                 3. minimum is between [low, high]
        // The proof that the loop will exit: after each iteration either the 'high' decreases
        // or the 'low' increases, so the interval [low, high] will always shrink.
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (num[mid] < num[high])
                // the mininum is in the left part
                high = mid;
            else if (num[mid] > num[high])
                // the mininum is in the right part
                low = mid + 1;
        }

        return num[low];
    }
}

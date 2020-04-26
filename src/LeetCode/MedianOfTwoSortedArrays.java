package LeetCode;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        int min[];
        int max[];
        if (nums1.length > nums2.length) {
            min = nums2;
            max = nums1;
        } else {
            min = nums1;
            max = nums2;
        }

        int[] ans = new int[nums1.length + nums2.length];
        for (int k = 0; k < min.length; k++) {
            if (min[i] > max[j]) {
                ans[k] = max[j];
                j++;
            } else {
                ans[k] = min[i];
                i++;
            }
        }

//        for (int l = min.length; l < ans.length; l++) {
//            ans[l] =
//        }
        return 0;
    }
}

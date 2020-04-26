package LeetCode;

public class MergeSortedArray {


    public static void main(String[] args) {

        int nums1[] = new int[]{1,2,3,0,0,0};
        int nums2[] = new int[]{2,5,6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        m--;
        n--;

        int index = nums1.length - 1;

        while(index >= 0) {

            if (m < 0) {
                nums1[index] = nums2[n];
                n--;
                index--;
                continue;
            }

            if (n < 0) {
                nums1[index] = nums1[m];
                m--;
                index--;
                continue;
            }

            if (nums2[n] > nums1[m]) {
                nums1[index] = nums2[n--];
            } else {
                nums1[index] = nums1[m--];
            }

            index--;
        }
    }
}

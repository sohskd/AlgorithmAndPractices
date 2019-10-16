package LeetCode;

public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {3, 3, 4, 4, 4, 3, 3};
        majorityElement(nums);
    }

    public static int majorityElement(int[] num) {

        int major = num[0], count = 1;
        for (int i = 1; i < num.length; i++) {

            if (count == 0) {
                count++;
                major = num[i];
            } else if (major == num[i]) {
                count++;
            } else count--;
        }

        return major;
    }
}

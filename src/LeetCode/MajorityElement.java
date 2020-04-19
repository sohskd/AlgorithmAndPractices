package LeetCode;

import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

//        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int[] nums = {3, 2, 3};

        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {

        int maj = nums[0];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != maj) {
                counter--;
            } else if (nums[i] == maj) {
                counter++;
            }

            if (counter == 0){
                counter++;
                maj = nums[i];
            }
        }

        return maj;
    }

//    public static int majorityElement(int[] nums) {
//
//        double s = nums.length / 2.0;
//        double majorCount = Math.ceil(s);
//
//        HashMap<Integer, Integer> h = new HashMap<>();
//        int count;
//        for (int i = 0; i < nums.length; i++) {
//            count = h.getOrDefault(nums[i], 0);
//            count++;
//            if (count == majorCount)
//                return nums[i];
//            else {
//                h.put(nums[i], count);
//            }
//        }
//
//        return 0;
//    }

}

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class canJump {

    public static void main(String[] args) {

//        int[] nums = new int[]{2, 3, 1, 1, 4};
        int[] nums = new int[]{3, 2, 1, 0, 4};

        int goal = nums.length - 1;
        // loop through from back to front.
        for (int i = nums.length - 1; i >= 0; i--) {
            int inter = i + nums[i];
            if (inter >= goal) {
                goal = i;
            }
        }

        boolean r = goal == 0 ? true : false;
        System.out.println(r);

        List<String> l = new ArrayList<>();
        l.stream().map(Arrays::asList);
    }
}

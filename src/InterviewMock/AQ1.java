package InterviewMock;

import java.util.Arrays;
import java.util.List;

public class AQ1 {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{-2, 3, 1, -5};

        System.out.println(minX(Arrays.asList(arr)));
    }

    public static int minX(List<Integer> arr) {
        // Write your code here
        int sum = 0;
        boolean fail;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            sum = i;
            fail = false;
            for (int j = 0; j < arr.size(); j++) {
                sum = sum + arr.get(j);
                if (sum < 1) {
                    fail = true;
                    break;
                }
            }
            if (!fail)
                return i;
        }
        return 0;
    }
}

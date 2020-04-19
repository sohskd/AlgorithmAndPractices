package InterviewMock;

import java.util.ArrayList;
import java.util.List;

public class Mastercard2 {

    public static void main(String[] args) {

        List<List<Integer>> grid = new ArrayList<>();

        List<Integer> gridin = new ArrayList<>();
        gridin.add(2);
        gridin.add(2);
        gridin.add(2);

        grid.add(gridin);

        List<Integer> gridin2 = new ArrayList<>();
        gridin2.add(3);
        gridin2.add(3);
        gridin2.add(3);

        grid.add(gridin2);

        List<Integer> gridin3 = new ArrayList<>();
        gridin3.add(4);
        gridin3.add(4);
        gridin3.add(4);

        grid.add(gridin3);

        largestSubgrid(grid, 14);

    }

    public static int largestSubgrid(List<List<Integer>> grid, int maxSum) {
        // Write your code here

        int length = grid.size();

        for (int i = length; i > 0; i--) {

            boolean check = true;

            int anchor = length - i;

            while (anchor)


            for (int j = 0; j < anchor + 1; j++) {


            }

        }

        return 0;
    }


}


//for (int l = 0; l < i; l++) {
//
//                int sum = 0;
//
//                for (int j = l; j < i; j++) {
//
//                    for (int k = 0; k < i; k++) {
//
//                        sum += grid.get(j).get(k);
//
//
//                    }
//                }
//
//                if (sum <= maxSum) {
//                    continue;
//                } else {
//                    check = false;
//                    break;
//                }
//            }
//
//            if (check) {
//                return i;
//            }
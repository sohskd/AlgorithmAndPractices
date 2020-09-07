package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QueueReconstruction {

    public static void main(String[] args) {

        // [[9,0],[7,0],[1,9],[3,0],[2,7],[5,3],[6,0],[3,4],[6,2],[5,2]]

        int[][] people = new int[][] { {9, 0} , {7, 0} , {1, 9} , {3, 0}, {2, 7} , {5, 3} , {6, 0} , {3, 4}, {6, 2} , {5, 2} };

        List<int[]> ans = new ArrayList<>();

        List<int[]> myList = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            myList.add(people[i]);
        }

        myList.sort(new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o2[0] - o1[0];
            }
        });

        while (myList.size() != 0) {
            List<int[]> filteredSubArray = myList.stream()
                    .filter(x -> x[0] == myList.get(0)[0])
                    .collect(Collectors.toList());

            myList.removeAll(filteredSubArray);

            for (int j = 0; j < filteredSubArray.size(); j++) {
                int[] p = filteredSubArray.get(j);
                ans.add(p[1], p);
            }

        }

        int[][] myAns = new int[ans.size()][2];
        for (int k = 0; k < ans.size(); k++) {
            myAns[k] = ans.get(k);
        }

//        return myAns;
    }
}

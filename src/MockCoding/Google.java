package MockCoding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Google {

    public static void main(String[] args) {

        int[] intergerList = new int[]{1, 6, 3, 9, 8, 5};

        System.out.println(find2ndSmallest(intergerList));
    }

//    public static int findSmallest(int[] integerList) {
//
//        int min = Integer.MAX_VALUE;
//
//        for (int i = 0; i < integerList.length; i++) {
//
//            if (integerList[i] < min)
//                min = integerList[i];
//        }
//
//        return min;
//    }

    public static int find2ndSmallest(int[] integerList) {

        int min = Integer.MAX_VALUE;
        int min2nd = Integer.MAX_VALUE;

        for (int i = 0; i < integerList.length; i++) {

            if (integerList[i] < min2nd)
                min2nd = integerList[i];

            if (min2nd < min) {
                int temp = min;
                min = min2nd;
                min2nd = temp;
            }
        }

        return min2nd;
    }
}

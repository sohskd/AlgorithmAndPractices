package Practice;

public class SecondSmallest {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 13, 1, 10, 34, 1};

//        int[] arr = new int[]{0, 0, 0, 0, Integer.MAX_VALUE};

//        int[] arr = new int[]{4, 1};

        System.out.println(secondSmallest2(arr));
    }

//    private static int secondSmallest(int[] myArr) {
//
//        if (myArr.length < 2) {
//            return 0;
//        }
//
//
//        int min = Integer.MAX_VALUE;
//        int secondmin = Integer.MAX_VALUE;
//
//        for (int i = 0; i < myArr.length; i++) {
//
//            if (myArr[i] < min) {
//                secondmin = min;
//                min = myArr[i];
//            } else if (myArr[i] < secondmin && myArr[i] != min) {
//                secondmin = myArr[i];
//            }
//        }
//
//        return secondmin;
//    }


    private static int secondSmallest2(int[] myArr) {
        if (myArr.length < 2)
            return 0;

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < myArr.length; i++) {
            if(myArr[i] < min) {
                min2 = min;
                min = myArr[i];
            } else if (myArr[i] < min2 && myArr[i] != min) {
                min2 = myArr[i];
            }
        }

        return min2;
    }


//
//    private static int secondSmallest2(int[] myArr) {
//        if (myArr.length < 2)
//            return 0;
//
//        int second = Integer.MAX_VALUE;
//        int first = Integer.MAX_VALUE;
//
//        for (int i = 0; i < myArr.length; i++) {
//
//            if (myArr[i] < first) {
//                second = first;
//                first = myArr[i];
//            } else if (myArr[i] < second && myArr[i] != first) {
//                second = myArr[i];
//            }
//        }
//
//        return second;
//    }
}

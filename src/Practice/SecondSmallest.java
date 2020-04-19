package Practice;

public class SecondSmallest {

    public static void main(String[] args) {
//        int[] arr = new int[]{12, 13, 1, 10, 34, 1};

//        int[] arr = new int[]{0, 0, 0, 0, Integer.MAX_VALUE};

        int[] arr = new int[]{4, 1};

        System.out.println(secondSmallest(arr));
    }

    private static int secondSmallest(int[] myArr) {

        if (myArr.length < 2) {
            return 0;
        }


        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        for (int i = 0; i < myArr.length; i++) {

            if (myArr[i] < min) {
                secondmin = min;
                min = myArr[i];
            } else if (myArr[i] < secondmin && myArr[i] != min) {
                secondmin = myArr[i];
            }
        }

        return secondmin;
    }
}

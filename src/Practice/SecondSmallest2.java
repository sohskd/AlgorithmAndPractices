package Practice;

public class SecondSmallest2 {

    public static void main(String[] args) {

        int[] arr = new int[] {1,7,3,4,3, 0};

        System.out.println(secondSmallest2(arr));
     }

    private static int secondSmallest2(int[] arr) {

        if (arr.length < 2)
            return 0;

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) {
                min2 = min;
                min = arr[i];
            } else if (min2 > arr[i] && arr[i] != min) {
                min2 = arr[i];
            }
        }

        return min2;
    }
}

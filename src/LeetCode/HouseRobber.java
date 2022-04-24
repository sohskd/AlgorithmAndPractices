package LeetCode;

public class HouseRobber {

    public static void main(String[] args) {

        int arr[] = new int[]{3, 1, 2, 5, 4};

        System.out.println(stealFromHouse(arr, 0));
    }

    private static int stealFromHouse(int[] arr, int index) {

        if (index >= arr.length) {
            return 0;
        }

        int l = arr[index] + stealFromHouse(arr, index + 2);
        int r = stealFromHouse(arr, index + 1);

        int max = Math.max(l, r);

        return max;
    }

    //    private static int rob(int[] nums) {
//        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int val = 0;
//            for (int j = i; j < nums.length; j += 2) {
//
//                int test2 = 0;
//                if (j + 1 < nums.length) {
//                    test2 = val;
//                    test2 += nums[j + 1];
//                }
//
//                val += nums[j];
//
//                if (test2 > val)
//                    val = test2;
//
//                if (val > max)
//                    max = val;
//            }
//        }
//        return max;
//    }
}

/**
 * let counter = 0;
 * <p>
 * function houseRobberRecursive(arr) {
 * function stealFromHouse(index) {
 * if(index >= arr.length) {
 * counter++;
 * return 0;
 * }
 * return Math.max(arr[index] + stealFromHouse(index + 2), stealFromHouse(index + 1));
 * }
 * return stealFromHouse(0);
 * }
 * <p>
 * // console.log(houseRobberRecursive([3, 1, 2, 5, 4, 2, 5]))
 * // houseRobberRecursive([1, 2, 3, 4])
 * // console.log(counter)
 * <p>
 * let results = {};
 * let array = [];
 * <p>
 * for(let i = 0; i <= 20; i++) {
 * houseRobberRecursive(array);
 * results[i] = counter;
 * counter = 0;
 * array.push(i);
 * }
 * <p>
 * console.log(results);
 */

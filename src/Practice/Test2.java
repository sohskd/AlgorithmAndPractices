package Practice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Test2 {

    public static void main(String[] args) {

//        SimpleDateFormat format = new SimpleDateFormat(
////                "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
////        format.setTimeZone(TimeZone.getTimeZone("UTC"));
////
////        Date d = new Date();
////        System.out.println(format.format(d));
////        System.out.println(LocalDateTime.now());

//
//        String word1 = "helloworld";
//
//        char[] word1Arr = word1.toCharArray();
//
//        int[] intArr = new int[] {16,2,4};
//
//        Arrays.sort(intArr);
//
//        System.out.println(Arrays.toString(intArr));


//        int[] nums = new int[] { 2,2,3,3,3,4 };

        int[] nums = new int[] { 3,4,2 };


        int[] sum = new int[10002];

        for(int i = 0; i < nums.length; i++){
            sum[nums[i]] += nums[i];
        }

        for(int i = 2; i < sum.length; i++){
            sum[i] = Math.max(sum[i-1], sum[i-2] + sum[i]);
        }
//        return sum[10001];

        System.out.println("Done");

    }
}

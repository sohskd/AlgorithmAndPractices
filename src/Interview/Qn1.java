package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Qn1 {

    public static void main(String[] args) {

        List<Integer> mapping = new ArrayList<>();
        mapping.add(2);
        mapping.add(1);
        mapping.add(4);
        mapping.add(8);
        mapping.add(6);
        mapping.add(3);
        mapping.add(0);
        mapping.add(9);
        mapping.add(7);
        mapping.add(5);

        List<String> nums = new ArrayList<>();

        nums.add("12");
        nums.add("02");
        nums.add("4");
        nums.add("023");
        nums.add("65");
        nums.add("83");
        nums.add("224");
        nums.add("50");

        strangeSort(mapping, nums);
        System.out.println("hi");
    }

    public static List<String> strangeSort(List<Integer> mapping, List<String> nums) {
        // Write your code here
        //HashMap<Integer, Integer> mappingHashMap = new HashMap<Integer, Integer>();

        List<String> answer = new ArrayList<String>();
        List<Integer> orderArr = new ArrayList<Integer>();
        HashMap<String, String> tempStrMap = new HashMap<>();

        for (String s : nums) {
            String myStr = "";
            for (int i = 0; i < s.length(); i++) {
                int dig = Character.getNumericValue(s.charAt(i));
                int idx = mapping.indexOf(dig);
                myStr += idx;
            }

            tempStrMap.put(myStr, s);

            orderArr.add(Integer.valueOf(myStr));

        }

        Collections.sort(orderArr);

        for (Integer j : orderArr) {
            answer.add(tempStrMap.get(String.valueOf(j)));
        }

        return answer;

    }
}



//    int index = 0;
//    int direct = 0;
//    int numberOfMove = 0;
//    int[] finalPosition = new int[originalString.length()];
//
//        for (int i = 0; i < direction.size(); i++) {
//
//        direct = direction.get(i);
//        numberOfMove = amount.get(i);
//
//        // left
//        if (direct == 0) {
//
//        // if negative
//        if (originalString[i] )
//
//        // not negative
//
//        } else {
//        // right
//
//        }
//        }
//
//        return "";
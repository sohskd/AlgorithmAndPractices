package InterviewMock;

import java.util.*;

public class strangeSort {

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
        }

        for (Map.Entry <String, String> entry : tempStrMap.entrySet()) {

            int j = 0;

            while (true) {

                System.out.println(Integer.valueOf("002") < Integer.valueOf("002"));

                if (j == answer.size()) {
                    answer.add(entry.getKey());
                    break;
                }

                if (answer.size() == 0) {
                    answer.add(entry.getKey());
                    break;
                }

                if (Integer.valueOf(entry.getKey()) < Integer.valueOf(answer.get(j))) {
                    if (j == 0)
                        answer.add(0, entry.getKey());
                    else
                        answer.add(j - 1, entry.getKey());
                    break;
                }

                j++;

            }
        }

//        int j = 0;
//
//        while (true) {
//
//            if (j == answer.size()) {
//                answer.add(s);
//                break;
//            }
//
//            if (answer.size() == 0) {
//                answer.add(s);
//                break;
//            }
//
//            if (Integer.valueOf(myStr) < Integer.valueOf(answer.get(j))) {
//                if (j == 0)
//                    answer.add(0, s);
//                else
//                    answer.add(j - 1, s);
//                break;
//            }
//
//            j++;
//
//        }


        return answer;
    }
}

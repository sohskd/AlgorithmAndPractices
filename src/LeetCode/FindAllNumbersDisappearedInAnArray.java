package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String[] args) {

        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();

        List<Integer> ans = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});

        System.out.println("Done");
    }

    /*
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);

        for (int i = 0; i < nums.length; i++) {

            if(myList.get(nums[i]-1) == nums[i])
                myList.set(nums[i]-1, -1);
            else
                continue;
        }

        List<Integer> ans = myList.stream().filter(x -> x > 0).collect(Collectors.toList());
        return ans;

    }
    */

    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<>();
        // method 1, boolean array flag
        // time: O(n)
        // space: O(n)
        int i = 0, len = nums.length;
        boolean[] check = new boolean[len];

        for (i = 0; i < len; i++) {

            check[nums[i] - 1] = true;
        }

        for (i = 0; i < len; i++) {

            if (check[i] == false) {

                res.add(i + 1);
            }
        }

        return res;
    }
}

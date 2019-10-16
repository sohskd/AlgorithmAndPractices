package Practice;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {

        int[] nums = {3 , 3, 4};

        TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());

        int j;
        for (int i = 0; i < nums.length; i++) {
            j = treeMap.getOrDefault(nums[i], 0);
            treeMap.put(nums[i], ++j);
        }

        Map.Entry<Integer, Integer> entry = treeMap.firstEntry();
        System.out.println(entry.getKey());
    }
}

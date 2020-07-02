package Practice;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Test {

    public static void main(String[] args) {

        HashMap<Integer, List<String>> myMap = new HashMap<>();

        List<String> l = new ArrayList<>();
        List<String> m = new ArrayList<>();

        l.add("hello");

        myMap.put(5, l);
        myMap.put(8, m);

        for (Integer i :  myMap.keySet()) {
            System.out.println(myMap.get(i));
        }
    }

    private static int func(int[] myArr) {

        Arrays.sort(myArr);

        System.out.println(Arrays.toString(myArr));

        return 0;
    }
}

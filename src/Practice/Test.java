package Practice;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class Test {

    public static void main(String[] args) {


        ArrayList<Integer> myArr = new ArrayList<>();

        myArr.add(5);
        myArr.add(1);
        myArr.add(8);


        System.out.println(myArr.toString());

        Collections.sort(myArr);

        System.out.println(myArr);

        HashMap<Integer, Integer> myHashMap = new HashMap<>();

        myHashMap.put(1, 6);
        myHashMap.put(2, 5);
        myHashMap.put(3, 2);

        for (Integer i : myHashMap.keySet()) {
            System.out.println(myHashMap.get(i));
        }
    }

    private static int func(int[] myArr) {

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        return 0;
    }
}

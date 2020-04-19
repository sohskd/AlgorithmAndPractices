package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        hashMap.put(1, 11);
        hashMap.put(2, 22);
        hashMap.put(3, 33);

        // entrySet()
        for (Map.Entry<Integer, Integer> i : hashMap.entrySet()) {
            System.out.println(i.getValue());
        }

        for (int i : hashMap.keySet()) {
            System.out.println(hashMap.get(i));
        }

        hashMap.entrySet().stream().forEach(System.out::println);

        HashMap<Integer, Integer> hashMap2 = (HashMap<Integer, Integer>) hashMap.clone();

        hashMap2.entrySet().stream().forEach(System.out::println);

        System.out.println("After clear");
        hashMap.clear();
        hashMap.entrySet().stream().forEach(System.out::println);

        System.out.println("After clone");




    }
}

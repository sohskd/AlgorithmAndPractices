package Collections;

import java.util.HashMap;
import java.util.HashSet;

public class testHashSet {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(3,3);
        hashMap.put(4,3);


        System.out.println(hashMap.size());
        HashSet<Integer> hashSet = new HashSet<Integer>(hashMap.values());

        System.out.println(hashSet);
    }
}

package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        linkedHashSet.add("4");
        linkedHashSet.add("5");
        linkedHashSet.add("5");
        linkedHashSet.add("6");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("1");
        System.out.println(hashSet.add("1"));
        System.out.println(hashSet.add("2"));
    }
}

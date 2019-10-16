package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceMethod {

    public static void main(String[] args) {

        List<String> myArr = new ArrayList<>();
        myArr.add("bob");
        myArr.add("john");
        myArr.add("dash");

        List<String> myArr2 = new ArrayList<>();
        myArr2.add("bob");
        myArr2.add("dash");

        // containsAll
        System.out.println(myArr.containsAll(myArr2));

        // addAll
        myArr.addAll(myArr2);
        System.out.println(myArr);

        // retainAll
        myArr.retainAll(myArr2);
        System.out.println(myArr);

        // removeAll
        myArr.removeAll(myArr2);
        System.out.println(myArr);

        // clear
        myArr.clear();
        System.out.println(myArr);
    }
}

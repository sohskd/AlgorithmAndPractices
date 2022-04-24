package Practice.genericspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesClassB extends DesSupClass {

    @Override
    public void printSomeDes() {
        System.out.println("des class b");

//        List<String>[] stringLists = new List<String>[1];
        List<Integer> intList = Arrays.asList(42);
    }
}

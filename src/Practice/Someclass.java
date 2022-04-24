package Practice;

import java.util.function.BiFunction;

public class Someclass implements BiFunction<Integer, Integer, Integer> {


    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }

    private void printsome() {
        System.out.println("hello");
    }

}

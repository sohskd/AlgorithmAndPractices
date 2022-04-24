package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class StringFormat {

    public static void main(String[] args) {

        String s = "A01";

//        System.out.println(String.format("%02d", 1));
//        System.out.println(String.format("%.2f", 1.223));
//        System.out.println(String.format("|%s|", "Hello World"));

        int[] n = new int[10];
        Arrays.fill(n, 100);
//        System.out.println(Arrays.toString(n));

        Function f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 3;
            }
        };

        System.out.println(Function.identity());

        System.out.println(myFunc(Function.identity(), 10));


        Someclass sc = new Someclass();

        Map<String, Integer> m = new HashMap<>();
        m.put("my", 5);
        System.out.println(m);
        m.merge("my", 1, sc);
        m.merge("a", 1, (a, b) -> a + b);
        System.out.println(m);
    }

    private static int myFunc(Function<Integer, Integer> f, int t) {
        return f.apply(t);
    }
}

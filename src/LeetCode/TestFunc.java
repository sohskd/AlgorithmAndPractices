//package LeetCode;
//
//import Practice.DesClass;
//import Practice.Someclass;
//
//import java.util.function.BiPredicate;
//import java.util.function.Function;
//import java.util.function.Predicate;
//
//public class TestFunc {
//
//    @FunctionalInterface
//    public interface func<T, R> {
//        R apply(T t);
//    }
//
//    public static String myMethod(Function<Integer, String> f) {
//        String s = f.apply(130);
//        return s;
//    }
//
//
//    public static boolean myPredicate(Predicate<Integer> i) {
//        return i.test(200);
//    }
//
//
//
//    public static boolean myBiPredicate(BiPredicate<Integer, Integer> biArg,
//                                        Integer c, Integer d) {
//        return biArg.test(c, d);
//    }
//
//    public static void main(String[] args) {
//
//        var w = myMethod(s -> {
//            var z = s * 2;
//            z += 3;
//            return String.valueOf(z);
//        });
//        System.out.println(w);
//
//
//        var r = myPredicate(s -> s > 200);
//        System.out.println(r);
//
//        BiPredicate<Integer, Integer> funcRef = (a, b) -> a > b;
//        var x = myBiPredicate(funcRef, 7, 6);
//
//        System.out.println(x);
//
//    }
//}

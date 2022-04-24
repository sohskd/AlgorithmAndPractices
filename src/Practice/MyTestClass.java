package Practice;

import java.util.Stack;

public class MyTestClass {

    public static void main(String[] args) {

        // 1st - condition
        // 2nd - update

//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//
//        System.out.println("Done");

        int[] T = new int[] {73, 74, 75, 71, 69, 72, 76, 73};

        dailyTemperatures(T);
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                ret[idx] = i - idx;
            }
            stack.push(i);
        }
        return ret;
    }
}

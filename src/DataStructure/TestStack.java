package DataStructure;

import java.util.Stack;

public class TestStack {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}

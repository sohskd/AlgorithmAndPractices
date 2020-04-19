package Practice;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        String str = "abc";

        int c = str.charAt(1) - 'a';

        System.out.println(c);

        int[] bob = new int[] {1};

        bob[0]++;

        bob[0]++;

        System.out.println(Arrays.toString(bob));

        String s = "helloworld";

        StringBuilder sb = new StringBuilder();


        for (int i =  s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
    }
}

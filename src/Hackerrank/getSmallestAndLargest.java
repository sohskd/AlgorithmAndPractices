package Hackerrank;

public class getSmallestAndLargest {

    public static void main(String[] args) {

        String s = "welcometojava";
        int k = 3;

        String smallest = s.substring(0, k);
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        for (int i = 0; i < s.length() - k + 1; i++) {
            String myStr = s.substring(i, i+k);
            System.out.println(myStr.compareTo(smallest));
            if (myStr.compareTo(smallest) < 0)
                smallest = myStr;

            if (myStr.compareTo(largest) > 0)
                largest = myStr;
        }

        System.out.println(smallest);
        System.out.println(largest);

    }
}

package LeetCode;

import java.util.HashMap;

public class maxNumberOfBalloons {

    public static void main(String[] args) {
        maxBallon();
    }

    public static int maxBallon() {
        String text = "nlaebolko";

        HashMap<Character, Integer> myHashMap = new HashMap<Character, Integer>();
        int count = 0;
        Character myChar = null;
        for (int i = 0; i < text.length(); i++) {
            myChar = text.charAt(i);
            count = myHashMap.getOrDefault(text.charAt(i), 0);
            myHashMap.put(text.charAt(i), count + 1);
        }

        String toForm = "balloon";

        int ans = 0;
        int j = 0;
        int countOfBalloon = 0;

        while(true) {

            countOfBalloon = myHashMap.get(toForm.charAt(j));
            if (countOfBalloon == 0)
                break;

            myHashMap.put(toForm.charAt(j), countOfBalloon-1);

            if (j == 6) {
                ans += 1;
                j = 0;
                continue;
            }

            j += 1;
        }

        return ans;
    }
}

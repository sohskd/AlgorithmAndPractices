package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofAPhoneNumber {

    public static void main(String[] args) {

        String digits = "23";

        LetterCombinationsofAPhoneNumber letterCombinationsofAPhoneNumber = new LetterCombinationsofAPhoneNumber();
        letterCombinationsofAPhoneNumber.letterCombinations(digits);

    }

    public List<String> letterCombinations(String digits) {

        HashMap<Character, String> myHashMap = new HashMap<>();
        myHashMap.put('1', null);
        myHashMap.put('2', "abc");
        myHashMap.put('3', "def");
        myHashMap.put('4', "ghi");
        myHashMap.put('5', "jkl");
        myHashMap.put('6', "mno");
        myHashMap.put('7', "pqrs");
        myHashMap.put('8', "tuv");
        myHashMap.put('9', "wxyz");

        int depth = 1;
        List<String> results = new ArrayList<>();

        int i = 0;
        String stringToBuild = "";
        dfs(digits, i, stringToBuild, myHashMap, results, depth);

        return results;
    }

    public void dfs(String digits, int digitIndex, String stringToBuild, HashMap<Character, String> myHashMap, List<String> results, int depth) {

        if (depth > digits.length())
            return;

        int counter = 0;
        String temp = stringToBuild;

        while (counter < myHashMap.get(digits.charAt(digitIndex)).length()) {

            stringToBuild = temp + myHashMap.get(digits.charAt(digitIndex)).charAt(counter);

            dfs(digits, digitIndex + 1, stringToBuild, myHashMap, results, depth + 1);

            counter += 1;

            if (stringToBuild.length() == digits.length())
                results.add(stringToBuild);
        }
    }
}

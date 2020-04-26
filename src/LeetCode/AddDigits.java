package LeetCode;

public class AddDigits {

    public static void main(String[] args) {

        int num = 38;

        System.out.println(10 / 10);

        addDigits(num);

    }
    public static int addDigits(int num) {

        while (num / 10 > 0) {
            int newNum = 0;
            while (num / 10 > 0) {
                int val = num % 10;
                newNum += val;
                num /= 10;
            }
            newNum += num;
            num = newNum;
        }
        return num;
    }

}

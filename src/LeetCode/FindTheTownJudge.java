package LeetCode;

public class FindTheTownJudge {

    public static void main(String[] args) {
//        int[][] newArr = new int[][]{{1, 3}, {2, 3}, {3, 1}};
        int[][] newArr = new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};

//        int[][] newArr = new int[][]{};

        System.out.println(findJudge(4, newArr));
    }

    public static int findJudge(int N, int[][] trust) {

        int[] count = new int[N + 1];

        for (int i = 0; i < trust.length; i++) {
            count[trust[i][0]]--;
            count[trust[i][1]]++;
        }

        for (int j = 1; j < count.length; j++) {
            if (count[j] == N - 1)
                return j;
        }

        return -1;
    }

//    public static int findJudge(int N, int[][] trust) {
//        int[] count = new int[N + 1];
//
//        for (int[] t : trust) {
//            count[t[0]]--;
//            count[t[1]]++;
//        }
//
//        for (int i = 1; i <= N; ++i) {
//
//            if (count[i] == N - 1)
//                return i;
//        }
//        return -1;
//    }
}

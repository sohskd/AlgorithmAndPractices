package Practice;

public class FindSmallestCommonElementInAllRows {

    public static void main(String[] args) {

        int[][] mat = new int[][]{{1, 2, 3, 4, 5}, {2, 4, 5, 8, 10}, {3, 5, 7, 9, 11}, {1, 3, 5, 7, 9}};

        int ans = smallestCommonElement(mat);

        System.out.println("Done");
    }

    public static int smallestCommonElement(int[][] A) {

        int[] count = new int[10001];
        int n = A.length, m = A[0].length;
        for (int j = 0; j < m; ++j)
            for (int i = 0; i < n; ++i)
                if (++count[A[i][j]] == n)
                    return A[i][j];
        return -1;
    }
}

package LeetCode;

public class ImageOverlap {

    public static void main(String[] args) {
        int[][] A = new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int[][] B = new int[][]{{0, 0, 0}, {0, 1, 1}, {0, 0, 1}};

        int max = largestOverlap(A, B);

        System.out.println(max);
    }

    public static int largestOverlap(int[][] A, int[][] B) {

        int largest = 0;
        for (int row = -A.length + 1; row < A.length; row++) {
            for (int col = -A[0].length + 1; col < A[0].length; col++) {
                // row = 2, col = 2
                largest = Math.max(largest, overLapOne(A, B, row, col));
            }
        }

        return largest;
    }

    private static int overLapOne(int[][] A, int[][] B, int rowOffset, int colOffset) {

        int count = 0;
        for (int row = 0; row < A.length; row++) {

            for (int col = 0; col < A[0].length; col++) {

                if (row + rowOffset < 0)
                    continue;
                else if (row + rowOffset >= A.length)
                    continue;
                else if (col + colOffset < 0)
                    continue;
                else if (col + colOffset >= A.length)
                    continue;
                else if (A[row][col] + B[row + rowOffset][col + colOffset] != 2)
                    continue;
                count++;
            }
        }

        return count;
    }
}

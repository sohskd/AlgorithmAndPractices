package Practice;

public class BinarySearchPractice {

    public static void main(String[] args) {
        int[] myArr = new int[] {1,5,8,10,16};

        System.out.println(binSearch(myArr, 10));
    }

    private static int binSearch(int[] myArr, int num) {

        int left = 0;
        int right = myArr.length - 1;
        while (left < right) {
            int mid = (right + left) / 2;
            if (myArr[mid] == num) {
                return mid;
            } else if (myArr[mid] < num) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return 0;
    }

//    private static int binSearch(int[] myArr, int num) {
//        int left = 0;
//        int right = myArr.length - 1;
//
//        while(left <= right) {
//            int mid = (left + right) / 2;
//            if (myArr[mid] == num)
//                return mid;
//            else if (num < myArr[mid]) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//
//        return -1;
//    }
}

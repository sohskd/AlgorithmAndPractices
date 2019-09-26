package Practice;
/*
//This is backtracking. DFS applied to a dynamically generated tree is called Backtracking. 
//Systematic way to search for solution to a problem.
*/
public class recursiveDFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// The -1 example ///
		//int[] arr = {0, 1, 1, 0, 0, 1, 0, 0, 1};
		//System.out.println(isSolvable(4, arr, 0));
		
		/// The failed case example ///
		int[] arr = {0, 1, 0};
		System.out.println(isSolvable(1, arr, 0));

	}
	private static boolean isSolvable(int m, int[] arr, int i){
		//i is the position
		if(i < 0 || arr[i] == 1)
			return false;
		//Remember that you must test if x + m > n -1 or x == n - 1 before you can mark a YES
		if(i == arr.length || i + m > arr.length)
			return true;
		
		//Mark the element so that when line 13 is visited again, it will not execute so that there is no repeat/infinite loop
		arr[i] = 1;
		return isSolvable(m, arr, i+1) || isSolvable(m, arr, i -1) || isSolvable(m, arr, i + m);
	}

}

package HeapSort;

import java.util.Arrays;   
import Practice.MergeSort;

public class QuickSort {
	public static void main(String[] args){

		//ArrayList<Integer> myArr = new ArrayList<Integer>();
		//Integer[] myArr = new Integer[5];
		Integer[] myArr = {78, 7, 41, 48, 62};
		//Using MergeSort Class populate function to help create an array of random integer
		//MergeSort m = new MergeSort();
		//m.populate(myArr);
		System.out.println("Before Sorted Array: ");
		System.out.println(Arrays.toString(myArr));
		
		QuickSort(myArr, 0, 4);
		
		System.out.println("After Sorted Array: ");
		System.out.println(Arrays.toString(myArr));
				
	}
	//low and high are indexes
	//pivot holds the actual value, not indexes
	public static void QuickSort(Integer[] arr, int low, int high){
		//Check for empty or null array
		if(arr == null || arr.length == 0){
			return;
		}
		
		if(low >= high){
			return;
		}
		
		//Get the pivot element from the middle of the list
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
		
		//Scan the array to swap lower element to left and bigger element to right of pivot
		int i = low;
		int j = high;
		while(i <= j){
			while(arr[i] < pivot){
				i++;
			}
			while(arr[j] > pivot){
				j--;
			}
			//It will come a point where i > j and that is when you cannot swap. you have to break out of the while loop
			if(i <= j){
				swap(arr, i, j);
				i++;
				j--;
			}			
		}
		
		//Recursively sort 2 sub parts
 		QuickSort(arr, low, j);
		QuickSort(arr, i, high);
	}
	private static void swap(Integer[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

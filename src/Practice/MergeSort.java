package Practice;

import java.util.ArrayList; 
import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args){

		//ArrayList<Integer> myArr = new ArrayList<Integer>();
		Integer[] myArr = new Integer[11];
		populate(myArr);
		System.out.println("Before Sorted Array: ");
		System.out.println(Arrays.toString(myArr));
		
		mergeSort(myArr);
		
		System.out.println("After Sorted Array: ");
		System.out.println(Arrays.toString(myArr));
				
		///// TESTING PLATFORM AND CONCEPTS///// 
		
		//System.arraycopy Example
		/*
		int[] arr = {1,2,3,4,5};
		int[] copied = new int[10];
		System.arraycopy(arr, 0, copied, 1, 5);
		System.out.println(Arrays.toString(copied));
		*/
		/*
		Comparable[] first = new Comparable[myArr.length / 2];
		System.arraycopy(myArr, 0, first, 0, 5);
		System.out.println(Arrays.toString(first));
		*/									
	}
	public static Comparable[] mergeSort(Comparable[] myArr){
		//if array is empty, no need to do anything
		if(myArr.length <= 1){
			return myArr;
		}
		
		//Split the array into half
		Comparable[] first = new Comparable[myArr.length / 2];
		Comparable[] second = new Comparable[myArr.length - first.length];
		System.arraycopy(myArr, 0, first, 0, first.length);
		System.arraycopy(myArr, myArr.length / 2, second, 0, second.length);
		
		//Sort each array into half recursively
		mergeSort(first);
		mergeSort(second);
		
		//Merge both halves together, overwriting to original array
		merge(first, second, myArr);	
		return myArr;
	}
	
	private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
		// TODO Auto-generated method stub
		int indexFirst = 0;
		int indexSecond = 0;
		int indexMergedList = 0;
		
		//Check if first or second is empty at every loop
		while(indexFirst < first.length && indexSecond < second.length){
			//If first element smaller than second element
			if(first[indexFirst].compareTo(second[indexSecond]) < 0){
				result[indexMergedList] = first[indexFirst];
				indexFirst++; 
			}
			else{
				result[indexMergedList] = second[indexSecond];
				indexSecond++;
			}
			indexMergedList++;
		}
		
		//Merge the remaining elements to the end of the new overwritten list
		System.arraycopy(first, indexFirst, result, indexMergedList, first.length - indexFirst);
		System.arraycopy(second, indexSecond, result, indexMergedList, second.length - indexSecond);		
	}
	
	public static Integer[] populate(Integer[] myArr)
	{		
		for(int i = 0; i < myArr.length; i++){
			myArr[i] = randomWithRange(1,100);
		}		
		return myArr;
	}
	
	public static int randomWithRange(int min, int max)
	{
	   int range = Math.abs(max - min) + 1;     
	   return (int)(Math.random() * range) + (min <= max ? min : max);
	}
}

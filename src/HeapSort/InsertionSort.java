package HeapSort;

//import MergeSort;
import java.util.Arrays;  

import HeapSort.MergeSort;

public class InsertionSort {
	/*
	 1) Data elements are grouped into two sections: a sorted section and an un-sorted section.
	 2) Take an element from the un-sorted section.
	 3) Insert the element into the sorted section at the correct position based on the comparable property.
     4) Repeat step 2 and 3 until no more elements left in the un-sorted section.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using MergeSort Class populate function to help create an array of random integer
		Integer[] myArr = {78, 7, 41, 48, 62};
		//MergeSort m = new MergeSort();
		//m.populate(myArr);
		System.out.println(Arrays.toString(myArr));
		InsertionSort(myArr, myArr.length);
		System.out.println(Arrays.toString(myArr));
		
		//swap(myArr, 0, 1);
		//System.out.println(Arrays.toString(myArr));

	}
	
	public static void InsertionSort(Comparable[] a, int length){
		for (int i = 1; i < length; i++){
			for(int j = i; j > 0; j--){
				if(a[j].compareTo(a[i-1]) < 0){
					//Integer b = (Integer)a;
					swap(a, j, i-1);
				}
				else{
					break;
				}
			}
		}		
	}
	
	public static void swap(Comparable[] myArr,int a, int b){
		Comparable temp;
		temp = myArr[a];
		myArr[a] = myArr[b];
		myArr[b] = temp;		
	}
}

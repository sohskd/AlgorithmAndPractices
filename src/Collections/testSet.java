package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class testSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set1 = new TreeSet<String>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("cow");
		set1.add("cat");
		
		System.out.println(set1);

		for (String element : set1) {
			System.out.println(element);
		}
		
//		if(set1.contains("cat")){
//			System.out.println("yes");
//		}
//
//		Set<String> intersection = new HashSet<String>(set1);
//
//		Set<String> set2 = new TreeSet<String>();
//
//		set2.add("dog");
//		set2.add("bird");
//		set2.add("swan");
//
//		//intersect
//		intersection.retainAll(set2);
//
//		System.out.println(intersection);
		
		
		
	}

}

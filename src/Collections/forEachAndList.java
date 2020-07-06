package Collections;

import java.util.*;

public class forEachAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> items = new ArrayList<>();
		items.add("Bob0");
		items.add("Bob1");
		items.add("Bob2");
		
		//Lambda output
		items.forEach(item->System.out.println(item));
		
		System.out.println();
		
		//Output condition if Bob1 
		items.forEach(item->{
			if("Bob1".equals(item)){
				System.out.println(item);
			}
		});
		
		System.out.println();
		
		//Method reference
		items.forEach(System.out::println);
		
		System.out.println();
		
		//Stream and filter
		items.stream()
		.filter(s->s.contains("Bob2"))
		.forEach(System.out::println);

		List<Integer> integerList = new ArrayList<>();
		integerList.add(9);
		integerList.add(5);
		integerList.add(8);

		Collections.sort(integerList, (o1, o2) -> o2 - o1);

		System.out.println(integerList.toString());
	}

}

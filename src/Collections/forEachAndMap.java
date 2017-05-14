package Collections;

import java.util.HashMap;
import java.util.Map;

public class forEachAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> items = new HashMap();
		items.put("A", 10);
		items.put("B", 10);
		items.put("C", 10);
		
		items.forEach((a,b)->System.out.println("Item : " + a + " Count : " + b));
		
		System.out.println();
		
		items.forEach((a,b) -> {
			System.out.println("Item : " + a + " Count : " + b);
			if("B".equals(a)){
				System.out.println("Hello B");
			}
		});

	}

}

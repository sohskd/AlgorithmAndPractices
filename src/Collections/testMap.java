package Collections;

import java.util.HashMap; 
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class testMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Does not guarantee any particular order
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		//Order is FIFO
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		//Maintains incremental order
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		//test(hashMap);
		test(linkedHashMap);
		//test(treeMap);
		

	}
	
	public static void test(Map<Integer, String> map){
		
		map.put(3, "dog");
		map.put(1, "cow");
		map.put(2, "bird");	
		
		for(Integer key : map.keySet()){
			String value = map.get(key);
			System.out.println(map.values());
			System.out.println(key + ": " + value);
		}
		
	}
	
}

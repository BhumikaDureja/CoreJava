package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key value need not be integer
		//Unique values should be entered in the HashMap so as to maintain uniqueness of the hash map
		// No insertion order is maintained in Hash Map
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1,"Suraj");
		map1.put(2,"Niraj");
		map1.put(3,"Sam");
		map1.put(10,"Nil");
		
		System.out.println(map1);
		
		//update data in map
		map1.put(2,"John");
		
		System.out.println(map1);
		
		//delete the entry
		map1.remove(10);
		System.out.println(map1);
		
		
		//to get values through Entry Set for loop to iterate throgh entire map
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
			System.out.println(entry1.getKey());
			System.out.println(entry1.getValue());
		} 
		
	for(Integer val: map1.keySet() ) {
			
			System.out.println("Key is " + val);
			System.out.println("Value is " + map1.get(val));
		}
		
		for (String val : map1.values()) {
			System.out.println("Value is "+val);
		}
		
		//--------LINKED HASHMAP------ INSERTION ORDER WILL WE MAINTAINED HERE------
		
		LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(1,"Suraj");
		map2.put(2,"Niraj");
		map2.put(3,"Sam");
		map2.put(10,"Nil");
		
		System.out.println(map2);

		//---------TREE MAP------ DATA Will always be stored in ascending order----
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(1,"Suraj");
		map3.put(10,"Nil");
		map3.put(2,"Niraj");
		map3.put(3,"Sam");
		
		System.out.println(map3);
		
		
		String str1 = "Clean India Green India Love India";
	}

}

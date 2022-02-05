package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("John");
		list1.add("Donald");
		list1.add("Jack");
		list1.add("Rick");
		
		System.out.println(list1);
		
		for(int index=0;index<list1.size();index++) {
			System.out.println(list1.get(index));
			System.exit(0);
			
		}
		System.exit(0);
	}

}

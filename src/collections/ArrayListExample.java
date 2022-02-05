package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("Raj"); // 0 index
		arrayList1.add("Priya"); // 1 index
		arrayList1.add("Reena"); // 2 index
		arrayList1.add("Rohan"); // 3 index
		
		System.out.println("The size of arrayList is "+arrayList1.size());
		System.out.println(arrayList1);
		
		System.out.println("The element at 0 index is "+arrayList1.get(0));
		arrayList1.remove(0);
		
		System.out.println("The size of arrayList is "+arrayList1.size());
		System.out.println(arrayList1);
		
		arrayList1.set(1, "Supriya"); // To replace the value at 1st Position
		
	// Iterating through array list
		for(int index=0; index<arrayList1.size();index++)
		{
			System.out.println(arrayList1.get(index));
		}
		
		//another way to print array list
		for (String name: arrayList1) {
			System.out.println(name);
		}
		
		Iterator<String> itr  = arrayList1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Sorting an arrayList - always sorts in ascending order by default
		
				Collections.sort(arrayList1);
				System.out.println(arrayList1);
		
				
				//  Reverse the collection sort or sorting in descending order
				
				Collections.reverse(arrayList1);
				System.out.println(arrayList1);
	}

}

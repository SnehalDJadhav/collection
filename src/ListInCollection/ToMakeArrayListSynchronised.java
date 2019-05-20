package ListInCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ToMakeArrayListSynchronised {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		LinkedList l=new LinkedList();
		al.add("snehal");//it will add element to next possition
		al.add(0, "hi");// here we can add to perticuler index
		
		
		/*arrayList is non synchronised to make it 
		synchronised we use method of  collections class*/	
		Collections.synchronizedList(al);
		
	Iterator itr = al.iterator();
	System.out.println(itr.hasNext());//it check cursor pointing to element is present 
											//or not ,returns boolean value   
	System.out.println(itr.next());//it will fetch the value,
	
	System.out.println(itr.equals("vasant"));
	System.out.println(itr.equals("Sneahl"));
	System.out.println(itr.equals(al));
		
		System.out.println(al);
		
		System.out.println(al.listIterator(0));
		System.out.println(al.listIterator());// it will give memory address
		
	}
}

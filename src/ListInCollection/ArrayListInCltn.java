package ListInCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInCltn {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		System.out.println(al.isEmpty());
		
		al.add("snehal");
		al.add(26);
		al.add("Jadhav");
		al.add("snehal");
		al.add(null);
		
		System.out.println(al.isEmpty());
		
		System.out.println(al);
		al.add("Uday");
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(0, "Jadhav");
		System.out.println(al);
		Object[] s = al.toArray();
		System.out.println(s);
		
		Collections.sort(al);
		System.out.println(al);
		
	}

}

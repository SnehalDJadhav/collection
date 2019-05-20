package ListInCollection;

import java.util.Collection;
import java.util.LinkedList;

public class LList {
	
	public static void main(String[] args) {
		
		int[] a=new int[10];
		
		LinkedList l=new LinkedList();
		
		LinkedList l2=new LinkedList(l);
		
		//LinkedList l3=new LinkedList(16); error
		
		l.add("hii");
		l.add("snehal");
		l.add("Dasharath");
		l.add("Jadhav");
		l.add("hii");
		l.add("snehal");
		l.add(null);
		l.add(1234);
		
		System.out.println(l);
		
		l.add(3, null);
		
		System.out.println(l);
		
		l.addFirst("welcome");
		System.out.println(l);
		
		l.addLast("Thank you");
		System.out.println(l);
		
		System.out.println(l.size());
		
		l.removeFirst();
		System.out.println(l);
		
		System.out.println(l.contains("snehal"));
		System.out.println(l.contains(1234));
		
		boolean l23= l.contains(1234);
		
		System.out.println(l2);
		
		
		
	}

}

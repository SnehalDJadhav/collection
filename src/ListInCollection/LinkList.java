package ListInCollection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkList {
	
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		LinkedList l=new LinkedList();
		
		System.out.println(l.size());
		l.add(al);
		System.out.println(l);
		al.add("snehal");
		al.add("jadhav");
		al.add(null);
		al.add("Belgaum");
		al.add(al);
		al.add(500);
		
		ArrayList<ArrayList<String>> al2=new ArrayList<>();
		System.out.println(al2);
		//System.out.println(al);
		System.out.println(l);
		
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable );
		System.out.println(al instanceof RandomAccess);
		
		
		al2.add(al);
		al2.add(al);
		//al2.add(l);
		//al2.addAll("swara");
		System.out.println(al2);
		System.out.println(al2.get(0));
		
		System.out.println(al instanceof Serializable);//true
		System.out.println(al instanceof Cloneable );//true
		System.out.println(al instanceof RandomAccess);//true
		
		System.out.println(l instanceof Serializable);//true
		System.out.println(l instanceof Cloneable );//true
		System.out.println(l instanceof RandomAccess);//false
		
		
		
	
	}

}

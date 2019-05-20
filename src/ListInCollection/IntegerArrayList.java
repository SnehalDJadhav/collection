package ListInCollection;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(20);
		al.add(10);
		al.add(78);
		al.add(1);
		al.add(13);
		//al.add("snehal"); //we can not add string in integer arrayList
		
		System.out.println(al);
		
		int index=Collections.binarySearch(al, 78);// to find the key index
		
		System.out.println(index);// to print index of key
		
		Collections.sort(al);// to sort the list
		System.out.println(al);
		
		System.out.println(Collections.binarySearch(al, 18));// -ve value,if value is not present in list
		System.out.println(Collections.binarySearch(al, 1)); // returns 0, if value is present
		
		int index1=Collections.binarySearch(al, 78);
		
		System.out.println(index1);
		
		//only object type array we can create
		Object[] a = al.toArray();
		
		//to store char array first convert to string then we can convert to char [] array
		String a2 = al.toString();
		char[] a3 = a2.toCharArray();
		
	}

}

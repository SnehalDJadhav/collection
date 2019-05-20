package ListInCollection;

import java.io.Serializable;
import java.util.ArrayList;

public class arrL {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();
		
		al1.add("hii");
		al1.add(',');
		al1.add("vison");
		al1.add("It");
		al1.add("solutions");
		
		Object al2 = al1.clone();// to create same arraylist
		
		System.out.println(al1);
		System.out.println(al2);
		
		System.out.println(al1.get(2));
		al1.add(2, null);
		
		System.out.println(al1);
		System.out.println(al2);
		
		//We can Directly convert arrayList to array
		Object[] a2 = al1.toArray();
		System.out.println(a2[0]);
		
		for(Object a3:a2){
		
			System.out.println(a3);
		}
		
	}
}

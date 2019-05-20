package ListInCollection;

import java.util.Vector;

public class VectorClass {
	
	public static void main(String[] args) {
		
		Vector v=new Vector<>();
		
		System.out.println("Capacity of vector  : "+v.capacity());
		System.out.println("Size of vector is : "+v.size());
		
		v.add("Snehal");
		v.addElement("Jadhav");
		System.out.println(v);
		v.add(0, "hi");
		
		System.out.println(v);
		
		System.out.println("Capacity of vector  : "+v.capacity());
		System.out.println("Size of vector is : "+v.size());
		
		for(int i=0;i<=10;i++){
			v.addElement(i);
		}
		
		System.out.println(v);
		
		System.out.println("Capacity of vector  : "+v.capacity());
		System.out.println("Size of vector is : "+v.size());
		
		
	}

}

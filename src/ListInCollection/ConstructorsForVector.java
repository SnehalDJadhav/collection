package ListInCollection;

import java.util.Vector;

public class ConstructorsForVector {
	
	public static void main(String[] args) {
		
	
	Vector v1=new Vector<>();
	
	Vector v2=new Vector(15);
	
	Vector v3=new Vector(v2);
	
	Vector v4=new Vector(100, 5);

	System.out.println(v1.capacity());// default cap 10
	System.out.println(v2.capacity()); //Given cap siz 15
	System.out.println(v3.capacity()); // default 0
	System.out.println(v4.capacity());// given 100
	
	}	

}

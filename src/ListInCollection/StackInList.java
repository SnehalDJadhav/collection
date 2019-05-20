package ListInCollection;

import java.util.Stack;

public class StackInList {

	public static void main(String[] args) {
		Stack s=new Stack();
		
		s.add("snehal"); // vector method
		s.push("Jadhav");
		System.out.println(s.size());
		
		s.push(" ");
		s.push(50);
		s.push(null);
		s.push("Jadhav");
		s.push(20.8);
		s.push(true);
		s.push("vision");
		
		System.out.println(s);
		System.out.println(s.elementAt(3));
		System.out.println(s.peek());
		System.out.println("Capacity "+s.capacity());
		System.out.println("size "+s.size());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.search("Jadhav"));
		
		System.out.println("Capacity "+s.capacity());
		System.out.println("size "+s.size());
		
		System.out.println(s.empty());
		
		s.push("vision");
		s.push("vision");
		s.push("vasant");
		s.push(null);
		s.push(78);
		s.push("hii");
		
		System.out.println("Capacity "+s.capacity());
		System.out.println("size "+s.size());
		
		
		
		
		
		
	}
}

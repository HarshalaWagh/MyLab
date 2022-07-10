package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExp1 {
	
	public static void main(String[] args) {
		 LinkedList ll=new LinkedList();
		 LinkedList ll1=new LinkedList();
		 
		
		 ll.add(90);
		 ll.add("122434bvvh");
		 ll.add('o');
		 ll.add(25.78);
		 
		 ll1.addAll(ll);
		 
		 System.out.println(ll);
		 System.out.println(ll.size());
		 System.out.println(ll.isEmpty());
		 System.out.println(ll.contains('o'));
		 
		 ll.remove(2);
		 System.out.println(ll.get(2));
		 System.out.println(ll1.size());
		 
		 System.out.println(ll.retainAll(ll1));
		 
		// Collections.sort(ll);
		 
		 
		 
		 
		 
		 
	}

}
